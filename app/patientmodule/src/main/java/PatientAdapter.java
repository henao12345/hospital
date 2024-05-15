import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PatientAdapter extends RecyclerView.Adapter<PatientAdapter.ViewHolder> {
    private final List<Patient> patientList;

    public PatientAdapter(List<Patient> patientList) {
        this.patientList = patientList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_patient, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Patient patient = patientList.get(position);
        holder.bind(patient);
    }

    @Override
    public int getItemCount() {
        return patientList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView firstNameTextView;
        private final TextView lastNameTextView;
        private final TextView ageTextView;
        private final TextView genderTextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            firstNameTextView = itemView.findViewById(R.id.firstNameTextView);
            lastNameTextView = itemView.findViewById(R.id.lastNameTextView);
            ageTextView = itemView.findViewById(R.id.ageTextView);
            genderTextView = itemView.findViewById(R.id.genderTextView);
        }

        public void bind(Patient patient) {
            firstNameTextView.setText(patient.getFirstName());
            lastNameTextView.setText(patient.getLastName());
            ageTextView.setText(String.valueOf(patient.getAge()));
            genderTextView.setText(patient.getGender());
        }
    }
}
