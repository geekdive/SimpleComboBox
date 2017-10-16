package id.co.dev.rabbaanii.combobox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class mainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        TextView text = (TextView)findViewById(R.id.pilih);
        switch(view.getId()) {
            case R.id.checkbox_meat:
                if (checked){
                    Toast.makeText(mainActivity.this, "This Meat!", Toast.LENGTH_SHORT).show();
                    text.setText("Meat");
                }if(!checked){
                    Toast.makeText(mainActivity.this, "This Unchecked!", Toast.LENGTH_SHORT).show();
                    text.setText("");
                }
                break;
            case R.id.checkbox_cheese:
                if (checked){
                    Toast.makeText(mainActivity.this, "This Cheese!", Toast.LENGTH_SHORT).show();
                    text.setText("Cheese");
                }if(!checked){
                    Toast.makeText(mainActivity.this, "This Unchecked!", Toast.LENGTH_SHORT).show();
                    text.setText("");
                }
                break;
        }
    }

}
