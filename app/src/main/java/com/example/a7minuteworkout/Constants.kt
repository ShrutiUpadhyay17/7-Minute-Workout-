package com.example.a7minuteworkout

object Constants {
    fun defaultExerciseList(): ArrayList<ExerciseModel>{
        val exerciseList = ArrayList<ExerciseModel>()

        val jumpingJacks = ExerciseModel(
            1,
            "Jumping Jacks",
            R.drawable.jumping_jacks_exercise,
            false,
            false
        )
        exerciseList.add(jumpingJacks)

        val wallSit = ExerciseModel(
            2,
            "Wall Sit",
            R.drawable.wall_sit,
            false,
            false
        )
        exerciseList.add(wallSit)

        val pushUps = ExerciseModel(
            3,
            "Push Ups",
            R.drawable.push_up_exercise,
            false,
            false
        )
        exerciseList.add(pushUps)

        val abdominalCrunch = ExerciseModel(
            4,
            "Abdominal Crunch",
            R.drawable.crunches,
            false,
            false
        )
        exerciseList.add(abdominalCrunch)

        val setUponChair = ExerciseModel(
            5,
            "Set Upon Chairs",
            R.drawable.step_up_onto_chair,
            false,
            false
        )
        exerciseList.add(setUponChair)

        val squat = ExerciseModel(
            6,
            "Squat",
            R.drawable.squat_exercise,
            false,
            false
        )
        exerciseList.add(squat)

        val tricepsDipOnChair = ExerciseModel(
            7,
            "Tricep Dip On Chair ",
            R.drawable.triceps,
            false,
            false
        )
        exerciseList.add(tricepsDipOnChair)

        val plank = ExerciseModel(
            8,
            "Plank",
            R.drawable.plank_exercise,
            false,
            false
        )
        exerciseList.add(plank)

        val highKneesRunningInPlace = ExerciseModel(
            9,
            "High Knees Running In Place ",
            R.drawable.high_knees_exercise,
            false,
            false
        )
        exerciseList.add(highKneesRunningInPlace)

        val lunges = ExerciseModel(
            10,
            "Lunges",
            R.drawable.lunges_exercise,
            false,
            false
        )
        exerciseList.add(lunges)

        val pushUpRotation = ExerciseModel(
            11,
            "Push Up Rotation",
            R.drawable.push_up_rotation_1,
            false,
            false
        )
        exerciseList.add(pushUpRotation)

        val sidePlank = ExerciseModel(
            12,
            "Side Plank",
            R.drawable.side_plack,
            false,
            false
        )
        exerciseList.add(sidePlank)


        return exerciseList
    }
}