package cartaovirtual.prj.ifsp.com.cartaovirtual;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_tollbar,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            /*case R.id.search_menu:{
                Toast.makeText(this, "Buscar", Toast.LENGTH_SHORT).show();
                break;
            }*/
            case R.id.myCards_menu:{
                Toast.makeText(this, "Vai para Activity dos Cartões", Toast.LENGTH_LONG).show();
                break;
            }
            case R.id.about_menu:{
                Toast.makeText(this, "Vai par tela que fala sobre aplicativo", Toast.LENGTH_LONG).show();
                break;
            }
        }


        return super.onOptionsItemSelected(item);
    }
}
