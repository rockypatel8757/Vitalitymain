package com.morgan.vitality

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import com.morgan.vitality.databinding.ActivityHomeBinding
import com.morgan.vitality.fragments.BalancedDiet
import com.morgan.vitality.fragments.HomeFrag
import com.morgan.vitality.fragments.MoreFrag
import com.morgan.vitality.fragments.Report
import com.morgan.vitality.fragments.WorkoutFrag


class Home : AppCompatActivity() {
    private lateinit var b:ActivityHomeBinding
    private lateinit var appbar: ActionBar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b= ActivityHomeBinding.inflate(layoutInflater)
        setContentView(b.root)
        onclick()
        drawerlyt()

        appbar= supportActionBar!!
        val mintent = intent.getStringExtra("disease")
        appbar.title= mintent

    }

    private fun drawerlyt() {
        val nav = b.navVew
        val mToolbar = b.toolbar
        val drawerLayout = b.mDrawerlyt

        setSupportActionBar(mToolbar)
        val adt = ActionBarDrawerToggle(this, drawerLayout, mToolbar, R.string.open, R.string.close)

        drawerLayout.addDrawerListener(adt)
        adt.syncState()

        b.navVew.setNavigationItemSelectedListener {

            if (it.itemId== R.id.first1){
                fragView(Report())
                b.bnbar.selectedItemId= R.id.report


            }else if (it.itemId==R.id.second2){
                fragView(HomeFrag())
                b.bnbar.selectedItemId= R.id.home
            }else if (it.itemId==R.id.third3){
                fragView(BalancedDiet())
                b.bnbar.selectedItemId= R.id.balenceddiet
            }else if (it.itemId==R.id.forth4){
                var intent= Intent(this,Home::class.java)
                intent.putExtra("disease","PCOS")
                startActivity(intent)
                finish()
            }else if (it.itemId==R.id.fifth5){
//PCOD
                var intent= Intent(this,Home::class.java)
                intent.putExtra("disease","PCOD")
                startActivity(intent)
                finish()
            }else if (it.itemId==R.id.sixth6){
//EMERGENCY
                val icall = Intent(Intent.ACTION_DIAL)
                icall.setData(Uri.parse("tel: 102"))
                startActivity(icall)
            }else if (it.itemId==R.id.seventh7){
//LOGOUT

            }else if (it.itemId==R.id.eighth8){
                fragView(MoreFrag())
                b.bnbar.selectedItemId= R.id.more
            }
            val nav11= b.mDrawerlyt
            nav11.closeDrawer(GravityCompat.START)
            return@setNavigationItemSelectedListener true

        }


    }


    private fun onclick() {

        fragView(HomeFrag())
        b.bnbar.selectedItemId= R.id.home
        b.bnbar.setOnNavigationItemSelectedListener {
            val id = it.itemId
            if (id==R.id.home){
                fragView(HomeFrag())
            }else if (id==R.id.balenceddiet){
                fragView(BalancedDiet())
            }else if (id==R.id.report){
                fragView(Report())
            }else if (id==R.id.more){
                fragView(MoreFrag())
            }else if (id==R.id.workout){
                fragView(WorkoutFrag())
            }
            return@setOnNavigationItemSelectedListener true
        }
    }
    fun fragView(fragment: Fragment){
        val fm = supportFragmentManager
        val bt = fm.beginTransaction()
        bt.replace(R.id.container,fragment)
        bt.commit()
    }

}