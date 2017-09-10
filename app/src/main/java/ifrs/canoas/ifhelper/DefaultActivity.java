package ifrs.canoas.ifhelper;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import ifrs.canoas.ifhelper.geral.CalculaFaltasActivity;
import ifrs.canoas.ifhelper.portal.ListarCursoActivity;

public abstract class DefaultActivity extends AppCompatActivity {

    public void setToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //TODO Estudar esse método e implementar a troca de idioma aqui conforme botão superior aqui.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        if (id == R.id.action_messages) {
            //Toast.makeText(getApplicationContext(), "aaaa", Toast.LENGTH_SHORT).show();
            Context contexto = getApplicationContext();
            Intent objIntent = new Intent(contexto, ListarCursoActivity.class);

            startActivity(objIntent);

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
