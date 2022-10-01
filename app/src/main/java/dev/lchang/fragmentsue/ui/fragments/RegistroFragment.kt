package dev.lchang.fragmentsue.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.google.android.material.snackbar.Snackbar
import dev.lchang.fragmentsue.R
import kotlinx.coroutines.NonDisposableHandle.parent

class RegistroFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_registro, container, false)

        val btnSave: Button = view.findViewById(R.id.btnSave)
        val etFullName: EditText = view.findViewById(R.id.etFullName)
        val etEmail: EditText = view.findViewById(R.id.etEmail)
        val spnCountry: Spinner = view.findViewById(R.id.spnCountry)
        val rgGender: RadioGroup = view.findViewById(R.id.rgGender)
        val chkLicense: CheckBox = view.findViewById(R.id.chkLicense)
        val chkCar: CheckBox = view.findViewById(R.id.chkCar)

        ArrayAdapter.createFromResource(requireContext(),
        R.array.country_array,
        android.R.layout.simple_spinner_item).also {
            adapter->adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spnCountry.adapter = adapter
        }

        var spnCountryValue=""
        spnCountry.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, p1: View?, position: Int, p3: Long) {
                spnCountryValue = parent?.getItemAtPosition(position).toString()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }

        btnSave.setOnClickListener {
            var fullNameValue = etFullName.text
            var emailValue = etEmail.text
            val intSelectButton: Int = rgGender!!.checkedRadioButtonId
            val radioButton: RadioButton = view.findViewById(intSelectButton)
            val genderValue = radioButton.text

            Toast.makeText(requireContext(), "Full Name: $fullNameValue", Toast.LENGTH_SHORT).show()
            Toast.makeText(requireContext(), "Email: $emailValue", Toast.LENGTH_SHORT).show()
            Toast.makeText(requireContext(), "Gender: $genderValue", Toast.LENGTH_SHORT).show()
            Toast.makeText(requireContext(), "Country: $spnCountryValue", Toast.LENGTH_SHORT).show()
            Toast.makeText(requireContext(), "License?: ${chkLicense.isChecked}", Toast.LENGTH_SHORT).show()
            Toast.makeText(requireContext(), "Car?: ${chkCar.isChecked}", Toast.LENGTH_SHORT).show()
        }
        return view
    }
}