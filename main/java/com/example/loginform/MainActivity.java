package com.example.loginform;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText username = (EditText)findViewById(R.id.etName);
        final EditText password = (EditText)findViewById(R.id.etPassword);
        Button login = (Button)findViewById(R.id.btnLogin);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((("admin".equals(username.getText().toString())) &&
                        ("test".equals(password.getText().toString()))) ||
                        (("ADMIN".equals(username.getText().toString())) &&
                                ("TEST".equals(password.getText().toString())))){
                    Toast.makeText(getApplicationContext(), "LOGIN SUCCESSFULL",
                            Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(getApplicationContext(), "LOGIN INVALID",
                            Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
