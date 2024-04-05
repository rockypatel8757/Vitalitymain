package com.morgan.vitality.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.morgan.vitality.R

class BalancedDiet : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_balanced_diet, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Fetch and display the image using Glide
        Glide.with(this)
            .load("https://firebasestorage.googleapis.com/v0/b/fir-72412.appspot.com/o/fruits-and-vegetables%20(2).jpg?alt=media&token=8fe1a1f9-0530-4590-98af-a2f1f0de1bd3")
            .into(view.findViewById(R.id.foodimg))
        glider("https://firebasestorage.googleapis.com/v0/b/fir-72412.appspot.com/o/fruits%2Fbanana.jpeg?alt=media&token=1e68d3f7-b778-46b2-bb1b-1831d32853f4",view.findViewById(R.id.imgf1))
        glider("https://firebasestorage.googleapis.com/v0/b/fir-72412.appspot.com/o/fruits%2Fgrapes.jpeg?alt=media&token=4b273675-4590-4582-831f-712ef555f909",view.findViewById(R.id.imgf2))
        glider("https://firebasestorage.googleapis.com/v0/b/fir-72412.appspot.com/o/fruits%2Fblueberries.jpeg?alt=media&token=36b68767-80f2-4ed5-af06-38092295c5be",view.findViewById(R.id.imgf3))
        glider("https://firebasestorage.googleapis.com/v0/b/fir-72412.appspot.com/o/fruits%2Fblackberries.jpeg?alt=media&token=af8f1a14-38b5-4906-b03d-af036c024c41",view.findViewById(R.id.imgf4))
        glider("https://firebasestorage.googleapis.com/v0/b/fir-72412.appspot.com/o/fruits%2Fkiwi.jpeg?alt=media&token=5b053a83-fb6e-4f27-9b73-e853613d3d62",view.findViewById(R.id.imgf6))
        glider("https://firebasestorage.googleapis.com/v0/b/fir-72412.appspot.com/o/fruits%2Forranges.jpeg?alt=media&token=299b49bc-e252-4840-acdf-d15d8b463a9c",view.findViewById(R.id.imgf7))
        glider("https://firebasestorage.googleapis.com/v0/b/fir-72412.appspot.com/o/fruits%2Fguava.jpeg?alt=media&token=01abe429-4b3d-4a62-b5e7-980bb695dc92",view.findViewById(R.id.imgf8))
        glider("https://firebasestorage.googleapis.com/v0/b/fir-72412.appspot.com/o/fruits%2Fpears.jpeg?alt=media&token=12e77d53-d620-455c-836e-e24b4621a374",view.findViewById(R.id.imgf9))
        glider("https://firebasestorage.googleapis.com/v0/b/fir-72412.appspot.com/o/fruits%2Fapples.jpeg?alt=media&token=1fc6850b-5441-4233-ae28-fb7060b8c90b",view.findViewById(R.id.imgf10))
        glider("https://firebasestorage.googleapis.com/v0/b/fir-72412.appspot.com/o/fruits%2Fmango.jpeg?alt=media&token=f4ba6244-2c78-4d07-b26d-e5988c311deb",view.findViewById(R.id.imgf11))
        glider("https://firebasestorage.googleapis.com/v0/b/fir-72412.appspot.com/o/fruits%2Fpomogranates.jpeg?alt=media&token=78e2df86-02f1-45e3-aa7c-aba545123361",view.findViewById(R.id.imgf12))

    }
    fun glider(url:String, img:ImageView){
        Glide.with(this)
            .load(url)
            .into(img)
    }
}
