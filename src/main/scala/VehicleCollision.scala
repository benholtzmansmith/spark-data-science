package com.bnrs

import org.joda.time.DateTime

case class VehicleCollision (
                              date:DateTime,
                              time:DateTime,
                              borough:String,
                              zipCode:Int,
                              numberOfPersonsKilled:Int,
                              numberOfPersonsInjured:Int
                            )
