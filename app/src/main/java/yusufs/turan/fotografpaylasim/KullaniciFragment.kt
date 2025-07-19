package yusufs.turan.fotografpaylasim

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import yusufs.turan.fotografpaylasim.databinding.FragmentKullaniciBinding


class KullaniciFragment : Fragment() {
    private var _binding:FragmentKullaniciBinding? = null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentKullaniciBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonKayit.setOnClickListener { kaydol(it) }
        binding.buttonGiris.setOnClickListener { giris(it) }
    }

    fun kaydol(view: View){
        Toast.makeText(context, "Kayıt Oluşturuldu", Toast.LENGTH_LONG).show()
        val action = KullaniciFragmentDirections.actionKullaniciFragmentToFeedFragment()
        Navigation.findNavController(view).navigate(action)
    }

    fun giris(view: View){
        println("Giriş Yapıldı")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}