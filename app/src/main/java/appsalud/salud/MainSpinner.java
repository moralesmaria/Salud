package appsalud.salud;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Spinner;
import android.widget.Toast;

public class MainSpinner extends AppCompatActivity {

    Spinner Lista;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Lista=(Spinner)findViewById(R.id.spinner);
        Lista.setOnItemSelectedListener(new OnItemSelectedListener() {

 @Override
 public void onItemSelected(AdapterView<?> arg0, View arg1,
  int arg2, long arg3) {

 Toast.makeText(MainSpinner.this, Lista.getSelectedItem().toString(), Toast.LENGTH_LONG).show();

 }

  @Override
  public void onNothingSelected(AdapterView<?> arg0) {

  }

  }

        );
    }
}