package com.example.testinghumbergerproject.ui.gallery

import android.annotation.TargetApi
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.testinghumbergerproject.R
import com.example.testinghumbergerproject.databinding.FragmentGalleryBinding
import com.google.android.flexbox.AlignItems
import com.google.android.flexbox.FlexDirection
import com.google.android.flexbox.FlexWrap
import com.google.android.flexbox.FlexboxLayoutManager

class GalleryFragment : Fragment() {
    private val skilletList = arrayListOf<Model>()
    private var _binding: FragmentGalleryBinding? = null
  // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val galleryViewModel =
            ViewModelProvider(this).get(GalleryViewModel::class.java)

        _binding = FragmentGalleryBinding.inflate(inflater, container, false)
        val root: View = binding.root
     //   loadData()
        startData()
        galleryViewModel.text.observe(viewLifecycleOwner) {

        }
        return root
    }

    private fun startData() {


        val webView = binding.webView1
        webView.settings.javaScriptEnabled = true
        webView.loadUrl("https://www.dreamstime.com/photos-images/band-skillet.html")
        val webViewClient: WebViewClient = object : WebViewClient() {
            @Deprecated("Deprecated in Java")
            override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
                view.loadUrl(url)
                return true
            }
            @TargetApi(Build.VERSION_CODES.N)
            override fun shouldOverrideUrlLoading(
                view: WebView,
                request: WebResourceRequest
            ): Boolean {
                view.loadUrl(request.url.toString())
                return true
            }
        }
        webView.webViewClient = webViewClient
    }

    /*    private fun loadData() {
            val flexboxLayoutManager=FlexboxLayoutManager(requireContext()).apply {
                flexWrap=FlexWrap.WRAP
                flexDirection=FlexDirection.ROW
                alignItems=AlignItems.STRETCH

            }
            val adapter = AdapterSkillet(skilletList)
            binding.recyclerview.adapter = adapter
            binding.recyclerview.setHasFixedSize(true)


            skilletList.add(
                Model(
                    "https://i.pinimg.com/originals/d5/72/59/d572596e941decd992ad06c4aa9262aa.png",
                    "https://i.pinimg.com/236x/db/ce/e9/dbcee9df7bcdd6a55b63de1a06231a6d.jpg"
                )
            )
            skilletList.add(
                Model(
                    "https://www.toledoblade.com/image/2014/02/22/1140x_a10-7_cTC/FEA-SKILLET-jpg-CHRISTIAN-ROCK.JPG",
                    "https://i.pinimg.com/736x/89/91/c1/8991c11b2536dfe7f896f3513fc85e37.jpg"
                )
            )

            skilletList.add(
                Model(
                    "https://i.pinimg.com/originals/47/08/ac/4708acbfd3e8b5b4f4eda173608ef74d.jpg",
                    "https://i.pinimg.com/736x/29/1f/8f/291f8fde7399456193ed9bff5b8ec868--skillet-quotes-skillet-lyrics.jpg"
                )
            )
            skilletList.add(
                Model(
                    "https://i.pinimg.com/550x/d1/ce/3f/d1ce3fafbd92eb8fe50128726706b5c7.jpg",
                    "https://412teens.org/qna/.images/christian-rock-700px.jpg"
                )
            )


            skilletList.add(
                Model(
                    "https://www.gannett-cdn.com/presto/2019/07/07/PMJS/210862c7-ca67-4d38-bf51-be9bdc7b38bd-07062019-BG-Skillet05.jpg",
                    "https://www.gratefulweb.com/sites/default/files/images/articles/unnamed%2843%29_8.jpg"
                )
            )
            skilletList.add(
                Model(
                    "https://jesusfreakhideout.com/news/2009/07/pics/awakeandaliveposter.jpg",
                    "https://atomsplitterpr.com/wp-content/uploads/2019/12/9cb8b2cd-b50a-4711-9cbc-7d928284a6b1.png"
                )
            )


            skilletList.add(
                Model(
                    "https://images.squarespace-cdn.com/content/v1/52c752e3e4b0df7dc79b5f0d/1565630973017-92G39YJ59W35F8ORJ5Z5/Credit+JessicaLynnLogan.jpg",
                    "https://i0.wp.com/rukusmag.com/wp-content/uploads/album-review-skillet-rukus.jpg?fit=600%2C387&ssl=1"
                )
            )
            skilletList.add(
                Model(
                    "https://smotretklipy.ru/wp-content/uploads/2016/04/64834401.jpg",
                    "https://townsquare.media/site/965/files/2022/11/attachment-DL-Size3.jpg?w=980&q=75"
                )
            )
        }*/
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}