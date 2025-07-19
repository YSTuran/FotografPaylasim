package yusufs.turan.fotografpaylasim

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.PopupMenu
import androidx.navigation.Navigation
import yusufs.turan.fotografpaylasim.databinding.FragmentFeedBinding
import yusufs.turan.fotografpaylasim.databinding.FragmentKullaniciBinding

class FeedFragment : Fragment(), PopupMenu.OnMenuItemClickListener {

    private var _binding: FragmentFeedBinding? = null
    private val binding get() = _binding!!
    private lateinit var popup :PopupMenu

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentFeedBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.floatingActionButton.setOnClickListener { floatingButtonTiklandi(it) }
        popup = PopupMenu(requireContext(), binding.floatingActionButton)
        val inflater = popup.menuInflater
        inflater.inflate(R.menu.my_popup_menu, popup.menu)
        popup.setOnMenuItemClickListener(this)
    }

    fun floatingButtonTiklandi(view: View){

        popup.show()

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onMenuItemClick(item: MenuItem?): Boolean {
        if(item?.itemId == R.id.yuklemeItem){
            val action = FeedFragmentDirections.actionFeedFragmentToYuklemeFragment()
            Navigation.findNavController(requireView()).navigate(action)
        }else if (item?.itemId   == R.id.cikisItem){
            val action = FeedFragmentDirections.actionFeedFragmentToKullaniciFragment()
            Navigation.findNavController(requireView()).navigate(action)
        }

        return true
    }


}