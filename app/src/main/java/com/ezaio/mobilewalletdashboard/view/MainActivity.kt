package com.ezaio.mobilewalletdashboard.view

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.ezaio.mobilewalletdashboard.R
import com.ezaio.mobilewalletdashboard.model.ContactsModel
import com.ezaio.mobilewalletdashboard.view.adapter.ContactAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var contactAdapter: ContactAdapter
    private var data: ArrayList<ContactsModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initData()
    }

    @SuppressLint("WrongConstant")
    private fun initData() {
        recyclerView.setHasFixedSize(true)
        val layoutManager = LinearLayoutManager(this,LinearLayout.HORIZONTAL,false)
        recyclerView.layoutManager = layoutManager

        data = ArrayList()

        val contact1 = ContactsModel("Jason","user_1")
        val contact2 = ContactsModel("Mandy","user_2")
        val contact3 = ContactsModel("Waston","user_3")
        val contact4 = ContactsModel("Shelly","user_4")
        val contact5 = ContactsModel("Jamie","user_5")
        val contact6 = ContactsModel("Shout","icon")
        val contact7 = ContactsModel("Shane","icon")
        val contact8 = ContactsModel("John","icon")

        data!!.add(contact1)
        data!!.add(contact2)
        data!!.add(contact3)
        data!!.add(contact4)
        data!!.add(contact5)
        data!!.add(contact6)
        data!!.add(contact7)
        data!!.add(contact8)

        contactAdapter = ContactAdapter(data!!)
        recyclerView.adapter = contactAdapter
    }
}