package com.example.final_project;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {
    private TextView reminderText;
    private TextView location;

    public MyViewHolder(View itemView) {
        super(itemView);
        reminderText = itemView.findViewById(R.id.reminder_text);
        location = itemView.findViewById(R.id.location);
    }

    public void bind(Task task) {
        reminderText.setText(task.getReminderText());
        location.setText(task.getLocation());
    }
}
