package com.wjx.navigation

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.navigation.NavigationBarView
import com.wjx.navigation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), NavigationBarView.OnItemSelectedListener {

    private lateinit var navController: NavController

    private lateinit var navHostFragment: NavHostFragment

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initView()

        /*supportActionBar?.apply {
            supportActionBar!!.hide()
        }*/

    }
    private fun initView(){

        navHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController

        // Either of two different navigation views might exist depending on the configuration.
        binding.bottomNavigation?.apply {
            //configureNavMenu(menu)
            setupWithNavController(navController)
            // 设置使用图标原来的颜色
            itemIconTintList = null
            setOnItemSelectedListener(this@MainActivity)
            setOnItemReselectedListener {} // prevent navigating to the same item
        }
        binding.navigationRail?.apply {
            //configureNavMenu(menu)
            setupWithNavController(navController)
            itemIconTintList = null
            setOnItemSelectedListener(this@MainActivity)
            // 防止导航到同一项目
            setOnItemReselectedListener {}
        }

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // 这里可以修改其他组件的内容
        navController.navigate(item.itemId)
        return true
    }
}