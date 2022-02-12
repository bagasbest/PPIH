package com.project.ppih.menu.feedback

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.firestore.FirebaseFirestore
import com.project.ppih.databinding.ActivityFeedbackAddBinding

class FeedbackAddActivity : AppCompatActivity() {

    private var binding : ActivityFeedbackAddBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFeedbackAddBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.save?.setOnClickListener {
            formValidation()
        }
    }

    private fun formValidation() {
        val name = binding?.name?.text.toString().trim()
        val comment = binding?.comment?.text.toString().trim()
        val rating = binding?.ratingBar?.rating.toString()

        when {
            name.isEmpty() -> {
                Toast.makeText(this, "Nama Lengkap tidak boleh kosong", Toast.LENGTH_SHORT).show()
            }
            comment.isEmpty() -> {
                Toast.makeText(this, "Komentar tidak boleh kosong", Toast.LENGTH_SHORT).show()
            }
            rating.isEmpty() -> {
                Toast.makeText(this, "Penilaian tidak boleh kosong", Toast.LENGTH_SHORT).show()
            }
            else -> {

                val uid = System.currentTimeMillis().toString()
                val data = mapOf(
                    "rate" to rating,
                    "name" to name,
                    "comment" to comment,
                    "uid" to uid,
                )

                FirebaseFirestore.getInstance()
                    .collection("feedback")
                    .document(uid)
                    .set(data)
                    .addOnCompleteListener {
                        if (it.isSuccessful) {
                            Toast.makeText(this, "Berhasil memberi penilaian", Toast.LENGTH_SHORT).show()
                            onBackPressed()
                        } else {
                            Toast.makeText(this, "Maaf, Gagal memberi penilaian", Toast.LENGTH_SHORT).show()
                        }
                    }
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}