package com.example.restaurant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var flag : String = "pizza"
    val button: Button =findViewById(R.id.btResult)
    val spinnerVal : Spinner = findViewById(R.id.spinnerV)
        var options = arrayOf("pizza","burger")
        spinnerVal.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,options )

        button.setOnClickListener{ view ->

                    if(flag =="pizza")
                        Toast.makeText(this, "it will cost you 10$", Toast.LENGTH_SHORT).show()
                    else
                        Toast.makeText(this, "it will cost you 7$", Toast.LENGTH_SHORT).show()

            }
        spinnerVal.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                flag = options.get(p2)
                Toast.makeText(this, ""+flag+" is selected", Toast.LENGTH_SHORT).show()
            } //p2 is the index of selected item

           override fun onNothingSelected(p0: AdapterView<*>?) {
               Toast.makeText(this, "nothing selected", Toast.LENGTH_SHORT).show()
           }
        }
            }


        }
