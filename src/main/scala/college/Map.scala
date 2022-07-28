package college

object LearnMap {

    //Map is a collection of key-value pairs. In other words, it is similar to dictionary.
    // Keys are always unique while values need not be unique. Key-value pairs can have any data type.
    // However, data type once used for any key and value must be consistent throughout.
    // Maps are classified into two types: mutable and immutable. By default Scala uses immutable Map.
    // In order to use mutable Map, we must import scala.collection.mutable.Map class explicitly.

    def main(args: Array[String]): Unit = {
        val map = Map("student1Name" -> "Bob", "student2Name" -> "Rob", "student3Name" -> "David" )
        println(map)

        // Accessing values using key

        val map1 = Map("David"-> 45, "Sam" -> 19 ,"Z.A Shaw" -> 55, "Bob"-> 23, "Martin" -> 30)
        println(map1("David")) //45

        //If key is not present and we want to access that it raise an error
        //println(map1("Sabir")) // the key "Sabir" is not present and if we want to access it then it will raise an error

        //  It is recommended to use contains() function while accessing any value using key.
        val name = "Bob"
        require(map1.contains(name) == true, s"$name is Not present in the list")
        println(map1(name))  //23

        //Filter in map
        val ageGreaterThan40 = map1.filter(person => person._2 >40)
        println(ageGreaterThan40)

        //Updating values in map
        println(map1("Sam"))  //19
        //map1("Sam") = 20 //We can't update map because by default we use immutable map, to update we have to use immutable map

        //MUTABLE MAP
        val mutableMap = scala.collection.mutable.Map("Bob" -> 29, "Sam" -> 33, "David"-> 45)
        println(mutableMap("Bob")) //29

        //Bob turn 30 today
        mutableMap("Bob") = 30
        println(mutableMap("Bob")) // 30

        // We can insert new key-value pairs in a mutable map using += operator followed by new pairs to be added or updated.
        println(s"Before adding: $mutableMap")

        //Adding new key and also updating one in a mutable list
        mutableMap += ("Alex" -> 39, "Sam"-> 35) //Adding a new key value pair ("Alex" -> 39) and Updating Sam to 35
        println(s"After Adding: $mutableMap")

        // Deleting a key-value pair in mutable list is similar to adding a new entry.
        // The difference is instead of += we use -= operator followed by keys that are to be deleted.

        println(s"Before Deleting: $mutableMap")
        mutableMap -= ("Alex", "Sam") //Just give the key name, Key and Value of Alex and Sam will be deleted
        println(s"After Deleting: $mutableMap")

        //Iterating on a map

        val map2 = Map("Apple"-> "Pink", "Papaya"-> "Yellow", "Mango"-> "Green")
        for((key, value) <- map2){
          println(s"$key: $value")
        }

        //Creating an Empty Map having Key-Value pair of type (String, Int)
        val newMap = scala.collection.mutable.Map[String, Int]()
        println(newMap.isEmpty) //true
        newMap("Sabir") = 20
        println(newMap)  // HashMap(Sabir -> 20)


    }
}
