package com.ezaio.mobilewalletdashboard.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.ezaio.mobilewalletdashboard.model.ContactsModel
import com.ezaio.mobilewalletdashboard.R

/**
 * @auther dustin.hsieh
 * @Date on 2023/6/16
 * @Description
 */
class ContactAdapter(var contactsModel: ArrayList<ContactsModel>): BaseRecyclerAdapter() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.content_item,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var name = holder.getView<TextView>(R.id.tvTitle)
        val pic = holder.getView<ImageView>(R.id.ivPic)

        name.text = contactsModel[position].name

        // get drawable icon package name
        val drawables = holder.itemView.context.resources.getIdentifier(contactsModel[position].picAddress,"drawable",
            holder.itemView.context.packageName
        )

        // use Glide set item logo
        Glide.with(holder.itemView.context).load(drawables).into(pic)
    }

    override fun getItemCount(): Int {
        return contactsModel.size
    }
}