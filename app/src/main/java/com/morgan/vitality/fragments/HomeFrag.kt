package com.morgan.vitality.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.morgan.vitality.R

class HomeFrag : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        // Fetch and display the image using Glide
        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/fir-72412.appspot.com/o/stock-photo-supple-young-woman-working-out-with-yoga.jpg?alt=media&token=4e84fff6-1e14-4a80-8d05-9bad6f9c2153")
            .into(view.findViewById(R.id.img1))

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/fir-72412.appspot.com/o/Bhujangasana-or-Cobra-Pose.jpg?alt=media&token=901eecfe-5025-4cd4-b6e6-92936e95f7f3")
            .into(view.findViewById(R.id.img2))

        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/fir-72412.appspot.com/o/inversion-yoga-poses%20(1).jpg?alt=media&token=3d543e7b-75ae-4adb-a6a2-e9d3b5861be9                  ")
            .into(view.findViewById(R.id.img3)) // Replace "imageView" with the id of your ImageView
    }
}
