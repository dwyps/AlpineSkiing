package com.example.alpineskiing2020season.data.repository

import android.util.Log
import com.example.alpineskiing2020season.data.model.Country
import com.example.alpineskiing2020season.data.model.Event
import com.example.alpineskiing2020season.data.model.Racer
import com.example.alpineskiing2020season.data.model.Record
import com.google.firebase.database.*
import timber.log.Timber

class Repository {

    private val ovrMen = mutableListOf<Racer>()
    private val gsMen = mutableListOf<Racer>()
    private val dhMen = mutableListOf<Racer>()

    private val dhWomen = mutableListOf<Racer>()
    private val gsWomen = mutableListOf<Racer>()
    private val ovrWomen = mutableListOf<Racer>()

    private val events = mutableListOf<Event>()

    private val records = mutableListOf<Record>()

    private val databaseReference: DatabaseReference = FirebaseDatabase.getInstance().reference


    companion object {

        @Volatile
        private var instance: Repository? = null

        fun getInstance() =
            instance ?: synchronized(this) {
                instance ?: Repository().also { instance = it }
            }
    }

    fun getOvrMen(): MutableList<Racer> {

        try {

            databaseReference.child("ovrMen").addValueEventListener(object : ValueEventListener {

                override fun onDataChange(snapshot: DataSnapshot) {

                    ovrMen.clear()

                    snapshot.children.forEach {

                        Log.e("Racer", "1")

                        ovrMen.add(
                            Racer(
                                Country(
                                    it.child("country").child("abbr").value.toString(),
                                    it.child("country").child("flag").value.toString()
                                ),
                                it.child("id").value.toString(),
                                it.child("image").value.toString(),
                                it.child("lastName").value.toString(),
                                it.child("name").value.toString(),
                                it.child("place").value.toString(),
                                it.child("points").value as Long
                            )
                        )
                    }

                    Log.e("Racer", ovrMen.size.toString())
                }

                override fun onCancelled(error: DatabaseError) {

                    Timber.e(error.message)
                }

            })

        } catch (e : Exception) {

            e.printStackTrace()
        }

        return ovrMen
    }

    fun getGsMen(): MutableList<Racer> {

        try {

            databaseReference.child("gsMen").addValueEventListener(object : ValueEventListener {

                override fun onDataChange(snapshot: DataSnapshot) {

                    gsMen.clear()

                    snapshot.children.forEach {

                        gsMen.add(
                            Racer(
                                Country(
                                    it.child("country").child("abbr").value.toString(),
                                    it.child("country").child("flag").value.toString()
                                ),
                                it.child("id").value.toString(),
                                it.child("image").value.toString(),
                                it.child("lastName").value.toString(),
                                it.child("name").value.toString(),
                                it.child("place").value.toString(),
                                it.child("points").value as Long
                            )
                        )
                    }
                }

                override fun onCancelled(error: DatabaseError) {

                    Timber.e(error.message)
                }

            })

        } catch (e : Exception) {

            e.printStackTrace()
        }

        return gsMen
    }

    fun getDhMen(): MutableList<Racer> {

        try {

            databaseReference.child("dhMen").addValueEventListener(object : ValueEventListener {

                override fun onDataChange(snapshot: DataSnapshot) {

                    dhMen.clear()

                    snapshot.children.forEach {

                        dhMen.add(
                            Racer(
                                Country(
                                    it.child("country").child("abbr").value.toString(),
                                    it.child("country").child("flag").value.toString()
                                ),
                                it.child("id").value.toString(),
                                it.child("image").value.toString(),
                                it.child("lastName").value.toString(),
                                it.child("name").value.toString(),
                                it.child("place").value.toString(),
                                it.child("points").value as Long
                            )
                        )
                    }
                }

                override fun onCancelled(error: DatabaseError) {

                    Timber.e(error.message)
                }

            })

        } catch (e : Exception) {

            e.printStackTrace()
        }

        return dhMen
    }



    fun getDhWomen(): MutableList<Racer> {

        try {

            databaseReference.child("dhWomen").addValueEventListener(object : ValueEventListener {

                override fun onDataChange(snapshot: DataSnapshot) {

                    dhWomen.clear()

                    snapshot.children.forEach {

                        dhWomen.add(
                            Racer(
                                Country(
                                    it.child("country").child("abbr").value.toString(),
                                    it.child("country").child("flag").value.toString()
                                ),
                                it.child("id").value.toString(),
                                it.child("image").value.toString(),
                                it.child("lastName").value.toString(),
                                it.child("name").value.toString(),
                                it.child("place").value.toString(),
                                it.child("points").value as Long
                            )
                        )
                    }
                }

                override fun onCancelled(error: DatabaseError) {

                    Timber.e(error.message)
                }

            })

        } catch (e : Exception) {

            e.printStackTrace()
        }

        return dhWomen
    }

    fun getGsWomen(): MutableList<Racer> {

        try {

            databaseReference.child("gsWomen").addValueEventListener(object : ValueEventListener {

                override fun onDataChange(snapshot: DataSnapshot) {

                    gsWomen.clear()

                    snapshot.children.forEach {

                        gsWomen.add(
                            Racer(
                                Country(
                                    it.child("country").child("abbr").value.toString(),
                                    it.child("country").child("flag").value.toString()
                                ),
                                it.child("id").value.toString(),
                                it.child("image").value.toString(),
                                it.child("lastName").value.toString(),
                                it.child("name").value.toString(),
                                it.child("place").value.toString(),
                                it.child("points").value as Long
                            )
                        )
                    }
                }

                override fun onCancelled(error: DatabaseError) {

                    Timber.e(error.message)
                }

            })

        } catch (e : Exception) {

            e.printStackTrace()
        }

        return gsWomen
    }

    fun getOvrWomen(): MutableList<Racer> {

        try {

            databaseReference.child("ovrWomen").addValueEventListener(object : ValueEventListener {

                override fun onDataChange(snapshot: DataSnapshot) {

                    ovrWomen.clear()

                    snapshot.children.forEach {

                        ovrWomen.add(
                            Racer(
                                Country(
                                    it.child("country").child("abbr").value.toString(),
                                    it.child("country").child("flag").value.toString()
                                ),
                                it.child("id").value.toString(),
                                it.child("image").value.toString(),
                                it.child("lastName").value.toString(),
                                it.child("name").value.toString(),
                                it.child("place").value.toString(),
                                it.child("points").value as Long
                            )
                        )
                    }
                }

                override fun onCancelled(error: DatabaseError) {

                    Timber.e(error.message)
                }

            })

        } catch (e : Exception) {

            e.printStackTrace()
        }

        return ovrWomen
    }

    fun getEvents(): MutableList<Event> {

        try {

            databaseReference.child("event").addValueEventListener(object : ValueEventListener {

                override fun onDataChange(snapshot: DataSnapshot) {

                    events.clear()

                    snapshot.children.forEach {

                        events.add(
                            Event(
                                it.child("date").value.toString(),
                                it.child("flag").value.toString(),
                                it.child("location").value.toString(),
                                it.child("discipline").value.toString(),
                                it.child("type").value.toString(),
                                it.child("women").value as Boolean,
                                it.child("men").value as Boolean
                            )
                        )
                    }
                }

                override fun onCancelled(error: DatabaseError) {

                    Timber.e(error.message)
                }

            })

        } catch (e : Exception) {

            e.printStackTrace()
        }

        return events
    }

    fun getRecords(): MutableList<Record> {

        try {

            databaseReference.child("records").addValueEventListener(object : ValueEventListener {

                override fun onDataChange(snapshot: DataSnapshot) {

                    records.clear()

                    snapshot.children.forEach {

                        records.add(
                            Record(
                                it.child("title").value.toString(),
                                it.child("content").value.toString(),
                                it.child("thumbnail").value.toString()
                            )
                        )
                    }
                }

                override fun onCancelled(error: DatabaseError) {

                    Timber.e(error.message)
                }

            })

        } catch (e : Exception) {

            e.printStackTrace()
        }

        return records
    }
}