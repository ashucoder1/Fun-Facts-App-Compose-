package com.example.funfacts.ui

import androidx.lifecycle.ViewModel

class FactsViewModel:ViewModel() {

    fun generateRandomFact(selectedAnimal:String):String{
        return if (selectedAnimal=="Dog"){
            getDogFacts().random()
        }else{
            getCatFacts().random()
        }
    }

    fun getDogFacts():List<String>{
        val dogFacts= listOf(
            "Dogs are known as 'man's best friend' due to their strong bond with humans.",
            "There are over 340 different dog breeds worldwide, recognized by various kennel clubs.",
            "The Basenji is often called the 'barkless dog' because it doesn't bark like most other breeds.",
            "Dogs have an extraordinary sense of smell, making them valuable for tasks like search and rescue.",
            "A dog's nose print is unique, much like a human's fingerprint.",
            "The Greyhound is one of the fastest dog breeds, capable of reaching speeds up to 45 miles per hour.",
            "Dogs communicate through body language, vocalizations, and various barks and growls.",
            "The Dalmatian is known for its distinctive black spots on a white coat.",
            "A dog's sense of hearing is also remarkable, with the ability to hear sounds at frequencies humans cannot.",
            "Service dogs are trained to assist people with disabilities, providing vital support and companionship."
        )
        return dogFacts
    }

    fun getCatFacts():List<String>{
        val catFacts= listOf(
            "Cats are known for their independent nature and often display a strong sense of individuality.",
            "There are more than 70 different recognized cat breeds, each with its own unique characteristics.",
            "The world's oldest known pet cat was found in a 9,500-year-old grave on the Mediterranean island of Cyprus.",
            "Cats have retractable claws, which they use for hunting and climbing.",
            "A cat's whiskers are highly sensitive and help them navigate in low light and tight spaces.",
            "Cats are crepuscular, which means they are most active during dawn and dusk.",
            "The Maine Coon is one of the largest domestic cat breeds, known for its friendly and sociable nature.",
            "Cats communicate through body language, purring, meowing, and even hissing or growling when agitated.",
            "A cat's grooming habits are essential for keeping clean and regulating body temperature.",
            "The ancient Egyptians revered and domesticated cats, and they were considered sacred animals in their culture."
        )
        return catFacts
    }
}