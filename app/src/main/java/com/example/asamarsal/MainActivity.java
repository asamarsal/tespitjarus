package com.example.asamarsal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private EditText masukkanusername;
    private EditText masukkanpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tombolCheckupdate = findViewById(R.id.tombolCheckupdate);

        // Textview username dan password
        masukkanusername = findViewById(R.id.masukkanusername);
        masukkanpassword = findViewById(R.id.masukkanpassword);

        // Ambil data dari EditText
        String username = masukkanusername.getText().toString();
        String password = masukkanpassword.getText().toString();

        // Fullscreen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // Button Login
        Button tombolLogin = findViewById(R.id.tombollogin);


        // Onclicklistener Pindah Activity
        tombolLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, MainMenu.class);
                startActivity(intent);
            }
        });

        tombolCheckupdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToastMessage("Anda sudah di versi terbaru !");
            }
        });

    /* UNTUK LOGIN USERNAME DAN PASSWORD. TAPI USERNAME DAN PASSWORD GAGAL
        // Onclicklistener Pindah Activity
        tombolLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Ambil data dari EditText
                String username = masukkanusername.getText().toString();
                String password = masukkanpassword.getText().toString();

                // Post login ke API
                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl("https://keraton.indward.com/api/sariroti_md/index.php/login/loginTest")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();

                LoginService service = retrofit.create(LoginService.class);
                Call<LoginResponse> call = service.login(username, password);

                call.enqueue(new Callback<LoginResponse>() {
                    @Override
                    public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                        if (response.isSuccessful()) {
                            // Jika login berhasil > Next ke mainmenu
                            Intent intent = new Intent(MainActivity.this, MainMenu.class);
                            startActivity(intent);
                        } else {
                            // Jika login gagal, Ada pesan error
                            // Edit di response.errorBody()
                        }
                    }

                    @Override
                    public void onFailure(Call<LoginResponse> call, Throwable t) {
                        // Jika ada gagal
                    }
                });
            }
        });

     */

    }
    private void showToastMessage(String message) {
        Toast toast = Toast.makeText(this, message, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP, 0, 0);
        toast.show();
    }
}