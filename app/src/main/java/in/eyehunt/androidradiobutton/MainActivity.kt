package `in`.eyehunt.androidradiobutton

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Single radio button no group
        //on click on button
        radioButton.setOnClickListener(View.OnClickListener {
            message("Selected")
        })
    }

    // multiple Radio click method
    fun onRadioButtonClicked(view: View) {
        var checked = view as RadioButton
        if (rb_male == checked) {
            message(rb_male.text.toString() + if (rb_male.isChecked) " Checked " else " UnChecked ")
        }
        if (rb_female == checked) {
            message(rb_female.text.toString() + if (rb_female.isChecked) " Checked " else " UnChecked ")
        }

        if (rb_football == checked) {
            message(rb_football.text.toString() + if (rb_football.isChecked) " Checked " else " UnChecked ")
        }
        if (rb_cricket == checked) {
            message(rb_cricket.text.toString() + if (rb_cricket.isChecked) " Checked " else " UnChecked ")
        }
        if (rb_hockey == checked) {
            message(rb_hockey.text.toString() + if (rb_hockey.isChecked) " Checked " else " UnChecked ")
        }
        if (rb_badminton == checked) {
            message(rb_badminton.text.toString() + if (rb_badminton.isChecked) " Checked " else " UnChecked ")
        }
    }

    fun message(str: String) {
        Toast.makeText(this, str, Toast.LENGTH_LONG).show()
    }

}
