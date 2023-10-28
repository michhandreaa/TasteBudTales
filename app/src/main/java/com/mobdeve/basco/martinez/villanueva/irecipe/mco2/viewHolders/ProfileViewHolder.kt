package com.mobdeve.basco.martinez.villanueva.irecipe.mco2.viewHolders

import androidx.recyclerview.widget.RecyclerView
import com.mobdeve.basco.martinez.villanueva.irecipe.mco2.databinding.SearchItemProfileBinding
import com.mobdeve.basco.martinez.villanueva.irecipe.mco2.models.ProfileModel

class ProfileViewHolder (private val viewBinding: SearchItemProfileBinding): RecyclerView.ViewHolder(viewBinding.root) {
    fun bindProfile (profile: ProfileModel) {
        this.viewBinding.ivUserProfilepicture.setImageResource(profile.imageId)
        this.viewBinding.tvUsername.text = profile.username
    }
}