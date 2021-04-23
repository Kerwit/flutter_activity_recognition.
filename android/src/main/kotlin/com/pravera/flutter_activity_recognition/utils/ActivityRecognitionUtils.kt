package com.pravera.flutter_activity_recognition.utils

import com.google.android.gms.location.DetectedActivity

class ActivityRecognitionUtils {
	companion object {
		fun getActivityTypeFromValue(type: Int): String {
			return when (type) {
				DetectedActivity.IN_VEHICLE -> "IN_VEHICLE"
				DetectedActivity.ON_BICYCLE -> "ON_BICYCLE"
				DetectedActivity.ON_FOOT -> "ON_FOOT"
				DetectedActivity.RUNNING -> "RUNNING"
				DetectedActivity.STILL -> "STILL"
				DetectedActivity.TILTING -> "TILTING"
				DetectedActivity.WALKING -> "WALKING"
				else -> "UNKNOWN"
			}
		}

		fun getActivityConfidenceFromValue(confidence: Int): String {
			return when (confidence) {
				in 75..100 -> "HIGH"
				in 50..75 -> "MEDIUM"
				else -> "LOW"
			}
		}
	}
}
