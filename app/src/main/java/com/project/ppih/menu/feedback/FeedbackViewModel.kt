package com.project.ppih.menu.feedback

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.firebase.firestore.FirebaseFirestore

class FeedbackViewModel : ViewModel() {

    private val feedback = MutableLiveData<ArrayList<FeedbackModel>>()
    private val listItems = ArrayList<FeedbackModel>()
    private val TAG = FeedbackViewModel::class.java.simpleName

    fun setListFeedback() {
        listItems.clear()


        try {
            FirebaseFirestore.getInstance().collection("feedback")
                .get()
                .addOnSuccessListener { documents ->
                    for (document in documents) {
                        val model = FeedbackModel()
                        model.uid = document.data["uid"].toString()
                        model.name = document.data["name"].toString()
                        model.rate = document.data["rate"].toString()
                        model.coment = document.data["comment"].toString()

                        listItems.add(model)
                    }
                    feedback.postValue(listItems)
                }
                .addOnFailureListener { exception ->
                    Log.w(TAG, "Error getting documents: ", exception)
                }
        } catch (error: Exception) {
            error.printStackTrace()
        }
    }

    fun getFeedbackList() : LiveData<ArrayList<FeedbackModel>> {
        return feedback
    }

}