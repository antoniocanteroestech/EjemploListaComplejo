package softepec.es.ejemplolistacompleja;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView mList;
    ArrayAdapter<User> mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mList = findViewById(R.id.user_list);

        mAdapter = new UsersAdapter(this,
                UsersRepository.getInstance().getUsers());

        mList.setAdapter(mAdapter);

        mList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                User currentUser = mAdapter.getItem(position);
                Toast.makeText(mAdapter.getContext(),
                        "Iniciar screen de detalle para: \n" + currentUser.getName(),
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
}
