package escom.ipn.mx.saludo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /* Other log levels are e - Error, w - Warn, i - Info */
        Log.d("MainActivity", "Saludar App");
    }

    public void showToast(View view){
        Toast saludo = Toast.makeText(this, R.string.text_saludar, Toast.LENGTH_LONG);
        saludo.show();
    }
}
