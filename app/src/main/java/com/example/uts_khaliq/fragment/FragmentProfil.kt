package com.example.uts_khaliq.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.example.uts_khaliq.R

class FragmentProfil : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_profil, container, false)
        val imageView = view.findViewById<ImageView>(R.id.photo)
        imageView.setImageResource(R.drawable.img_photo)
        return view
    }
    companion object {
        @JvmStatic
        fun newInstance() = FragmentProfil()
    }
}