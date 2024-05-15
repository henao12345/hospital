import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class PatientsListActivity extends AppCompatActivity {
    private List<Patient> patientList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patients_list);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        if (recyclerView != null) {
            // Añadir datos a la lista antes de asignar el adaptador
            Patient samplePatient = new Patient("John", "Doe", 30, Patient.Gender.MALE);
            patientList.add(samplePatient);

            PatientAdapter adapter = new PatientAdapter(patientList);
            recyclerView.setAdapter(adapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
        } else {
            Log.e("PatientsListActivity", "RecyclerView no encontrado en el layout");
        }
    }
}
