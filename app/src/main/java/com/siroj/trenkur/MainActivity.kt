package com.siroj.trenkur

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.ActionBar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.siroj.trenkur.model.ShavingStyle
import com.siroj.trenkur.model.ShavingStylesData

class MainActivity : AppCompatActivity() {

    private lateinit var rvShavingStyles: RecyclerView
    private var list: ArrayList<ShavingStyle> = arrayListOf()
    private var title: String = "TrenKur"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setActionBarTitle(title)

        rvShavingStyles = findViewById(R.id.rv_shaving_styles)
        rvShavingStyles.setHasFixedSize(true)

        list.addAll(ShavingStylesData.ListData)
        showRecyclerList()
    }

    private fun setActionBarTitle(title: String) {
        if(supportActionBar != null){
            (supportActionBar as ActionBar).title = title
        }
    }

    private fun showRecyclerList() {
        rvShavingStyles.layoutManager = LinearLayoutManager(this)
        val listShavingStyleAdapter = ListShavingStyleAdapter(list)
        rvShavingStyles.adapter = listShavingStyleAdapter

        listShavingStyleAdapter.setOnItemClickCallback(object : ListShavingStyleAdapter.OnItemClickCallback{
            override fun onItemClicked(data: ShavingStyle) {
                showSelectedShavingStyle(data)
            }
        })
    }

    private fun showSelectedShavingStyle(shavingStyle: ShavingStyle) {
        val moveIntent = Intent(this@MainActivity, DetailShavingStyleActivity::class.java)
        moveIntent.putExtra(DetailShavingStyleActivity.EXTRA_NAME, shavingStyle.title);
        moveIntent.putExtra(DetailShavingStyleActivity.EXTRA_DESCRIPTION, shavingStyle.detail);
        moveIntent.putExtra(DetailShavingStyleActivity.EXTRA_PHOTO, shavingStyle.photo);
        startActivity(moveIntent)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when(selectedMode){
            R.id.action_about -> {
                showAbout()
            }
        }
    }

    private fun showAbout() {
        val moveIntent = Intent(this@MainActivity, AboutActivity::class.java)
        startActivity(moveIntent)
    }
}
