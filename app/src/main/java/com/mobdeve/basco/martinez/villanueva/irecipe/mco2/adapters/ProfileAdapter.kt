package com.mobdeve.basco.martinez.villanueva.irecipe.mco2.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.activity.result.ActivityResultLauncher
import androidx.recyclerview.widget.RecyclerView
import com.mobdeve.basco.martinez.villanueva.irecipe.mco2.ProfileViewActivity
import com.mobdeve.basco.martinez.villanueva.irecipe.mco2.databinding.SearchItemProfileBinding
import com.mobdeve.basco.martinez.villanueva.irecipe.mco2.models.ProfileModel
import com.mobdeve.basco.martinez.villanueva.irecipe.mco2.viewHolders.ProfileViewHolder

class ProfileAdapter (private val profile: ArrayList<ProfileModel>): RecyclerView.Adapter<ProfileViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileViewHolder {
        val profileViewBinding: SearchItemProfileBinding = SearchItemProfileBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false)

        val viewHolder = ProfileViewHolder(profileViewBinding)

//        viewHolder.itemView.setOnClickListener {
//            val intent : Intent = Intent(viewHolder.itemView.context, ProfileViewActivity::class.java)
//            this.myActivity.launch(intent)
//        }

        return viewHolder
    }

    override fun onBindViewHolder(holder: ProfileViewHolder, position: Int) {
        holder.bindProfile(this.profile[position])


    }

    override fun getItemCount(): Int {
        return profile.size
    }

}