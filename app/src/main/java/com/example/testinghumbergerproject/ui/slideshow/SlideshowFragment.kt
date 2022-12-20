package com.example.testinghumbergerproject.ui.slideshow

import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.MediaController
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.testinghumbergerproject.databinding.FragmentSlideshowBinding

class SlideshowFragment : Fragment() {

    private var _binding: FragmentSlideshowBinding? = null
    private val monster = "https://clck.ru/3356mJ"
    private val hero = "https://clck.ru/3356jq"
    private val awakeAndAlive = "https://clck.ru/3356hs"
    private val saveMe = "https://clck.ru/3356gK"


    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val slideshowViewModel =
            ViewModelProvider(this).get(SlideshowViewModel::class.java)

        _binding = FragmentSlideshowBinding.inflate(inflater, container, false)
        val root: View = binding.root
        startedVideo()
        slideshowViewModel.text.observe(viewLifecycleOwner) {
        }
        return root
    }

    private fun startedVideo() {
        binding.btMonster.setOnClickListener {
            val uri = Uri.parse(monster)
            binding.startVideo.setVideoURI(uri)
            val mediaController = MediaController(this.requireContext())
            mediaController.setAnchorView(binding.startVideo)
            mediaController.setMediaPlayer(binding.startVideo)
            binding.startVideo.setMediaController(mediaController)
            binding.startVideo.start()
        }
        binding.btHero.setOnClickListener {
            val uri = Uri.parse(hero)
            binding.startVideo.setVideoURI(uri)
            val mediaController = MediaController(this.requireContext())
            mediaController.setAnchorView(binding.startVideo)
            mediaController.setMediaPlayer(binding.startVideo)
            binding.startVideo.setMediaController(mediaController)
            binding.startVideo.start()
        }
        binding.btAwake.setOnClickListener {
            val uri = Uri.parse(awakeAndAlive)
            binding.startVideo.setVideoURI(uri)
            val mediaController = MediaController(this.requireContext())
            mediaController.setAnchorView(binding.startVideo)
            mediaController.setMediaPlayer(binding.startVideo)
            binding.startVideo.setMediaController(mediaController)
            binding.startVideo.start()
        }
        binding.btSaveMe.setOnClickListener {
            val uri = Uri.parse(saveMe)
            binding.startVideo.setVideoURI(uri)
            val mediaController = MediaController(this.requireContext())
            mediaController.setAnchorView(binding.startVideo)
            mediaController.setMediaPlayer(binding.startVideo)
            binding.startVideo.setMediaController(mediaController)
            binding.startVideo.start()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}