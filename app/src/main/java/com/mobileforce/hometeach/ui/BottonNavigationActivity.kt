package com.mobileforce.hometeach.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.mobileforce.hometeach.fragment.ParentStudentHomepageFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.mobileforce.hometeach.R
import com.mobileforce.hometeach.databinding.BottonNavLayoutBinding

//import kotlinx.android.synthetic.main.activity_main.*

class BottonNavigationActivity : AppCompatActivity() {;

    lateinit var binding: BottonNavLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = BottonNavLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navController = findNavController(this, R.id.nav_host_fragment)

        binding.bottomNavigationView.setupWithNavController(navController)

        //  bottomNavigationView.setOnNavigationItemReselectedListener(mOnnavigationitemselected)
//        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
//        bottomNavigationView.setOnNavigationItemSelectedListener {
//
//            when (it.itemId) {
//
//                R.id.books -> {
//                    //call the load fragment method and passs the name of the fragment
//
//                    return@setOnNavigationItemSelectedListener true
//                }
//                R.id.contacts -> {
//                    //call the load fragment method and passs the name of the fragment
//                    return@setOnNavigationItemSelectedListener true
//                }
//
//
//                R.id.home -> {
////                    loadFragment(ParentStudentHomepageFragment())
//                    return@setOnNavigationItemSelectedListener true
//                }
//                R.id.notification -> {
//                    //call the load fragment method and passs the name of the fragment
//                    return@setOnNavigationItemSelectedListener true
//                }
//                R.id.profile -> {
//                    //call the load fragment method and passs the name of the fragment
//                    return@setOnNavigationItemSelectedListener true
//                }
//
//            }
//            false
//        }
//
//    }

//        bottomNavigationView.setOnNavigationItemSelectedListener {
//
//            when (it.itemId) {
//
//                R.id.books -> {
//                  //call the load fragment method and passs the name of the fragment
//
//                    return@setOnNavigationItemSelectedListener true
//                }
//                R.id.contacts -> {
//                    //call the load fragment method and passs the name of the fragment
//                    return@setOnNavigationItemSelectedListener true
//                }
//
//
//                R.id.home -> {
//                    loadFragment(ParentStudentHomepageFragment())
//                    return@setOnNavigationItemSelectedListener true
//                }
//                R.id.notification -> {
//                    //call the load fragment method and passs the name of the fragment
//                    return@setOnNavigationItemSelectedListener true
//                }
//                R.id.profile -> {
//                    //call the load fragment method and passs the name of the fragment
//                    return@setOnNavigationItemSelectedListener true
//                }
//
//            }
//            false
//        }
//
//
    }

    private fun loadFragment(fragment: Fragment) {
        // load fragment
        val transaction = supportFragmentManager.beginTransaction()
//        transaction.replace(R.id.frame_layout, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }


}