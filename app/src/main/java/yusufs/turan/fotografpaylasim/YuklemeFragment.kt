package yusufs.turan.fotografpaylasim

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import yusufs.turan.fotografpaylasim.databinding.FragmentKullaniciBinding
import yusufs.turan.fotografpaylasim.databinding.FragmentYuklemeBinding

class YuklemeFragment : Fragment() {

    private var _binding: FragmentYuklemeBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentYuklemeBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    fun gonderiYukle(view: View){
        binding.buttonYukle.setOnClickListener { gonderiYukle(it) }
        binding.imageView.setOnClickListener{gorselSec(it)}
    }

    fun gorselSec(view: View){

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}