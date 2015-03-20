package co.get;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    String Nombre;
    TextView txt_Hola;
    EditText edt_Nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_Nombre = (EditText) findViewById(R.id.edt_Nombre);
        Button btn_Saludar = (Button) findViewById(R.id.btn_Saludar);
        txt_Hola = (TextView) findViewById(R.id.txt_Hola);
        //  edt_Nombre.setText("Hola GET");


       // Log.e("Nombre",Nombre);

        btn_Saludar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Nombre = edt_Nombre.getText().toString();
                int numero= Integer.parseInt(Nombre);

                Log.e("Nombre",Nombre);
                txt_Hola.setText("Hola " + Nombre);
            }
        });



    }


}
