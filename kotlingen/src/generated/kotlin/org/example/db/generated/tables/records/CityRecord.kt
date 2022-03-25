/*
 * This file is generated by jOOQ.
 */
package org.example.db.generated.tables.records


import java.time.LocalDateTime

import org.example.db.generated.tables.City
import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record4
import org.jooq.Row4
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class CityRecord() : UpdatableRecordImpl<CityRecord>(City.CITY), Record4<Int?, String?, Short?, LocalDateTime?> {

    var cityId: Int?
        set(value): Unit = set(0, value)
        get(): Int? = get(0) as Int?

    var city: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    var countryId: Short?
        set(value): Unit = set(2, value)
        get(): Short? = get(2) as Short?

    var lastUpdate: LocalDateTime?
        set(value): Unit = set(3, value)
        get(): LocalDateTime? = get(3) as LocalDateTime?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Int?> = super.key() as Record1<Int?>

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row4<Int?, String?, Short?, LocalDateTime?> = super.fieldsRow() as Row4<Int?, String?, Short?, LocalDateTime?>
    override fun valuesRow(): Row4<Int?, String?, Short?, LocalDateTime?> = super.valuesRow() as Row4<Int?, String?, Short?, LocalDateTime?>
    override fun field1(): Field<Int?> = City.CITY.CITY_ID
    override fun field2(): Field<String?> = City.CITY.CITY_
    override fun field3(): Field<Short?> = City.CITY.COUNTRY_ID
    override fun field4(): Field<LocalDateTime?> = City.CITY.LAST_UPDATE
    override fun component1(): Int? = cityId
    override fun component2(): String? = city
    override fun component3(): Short? = countryId
    override fun component4(): LocalDateTime? = lastUpdate
    override fun value1(): Int? = cityId
    override fun value2(): String? = city
    override fun value3(): Short? = countryId
    override fun value4(): LocalDateTime? = lastUpdate

    override fun value1(value: Int?): CityRecord {
        this.cityId = value
        return this
    }

    override fun value2(value: String?): CityRecord {
        this.city = value
        return this
    }

    override fun value3(value: Short?): CityRecord {
        this.countryId = value
        return this
    }

    override fun value4(value: LocalDateTime?): CityRecord {
        this.lastUpdate = value
        return this
    }

    override fun values(value1: Int?, value2: String?, value3: Short?, value4: LocalDateTime?): CityRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        return this
    }

    /**
     * Create a detached, initialised CityRecord
     */
    constructor(cityId: Int? = null, city: String? = null, countryId: Short? = null, lastUpdate: LocalDateTime? = null): this() {
        this.cityId = cityId
        this.city = city
        this.countryId = countryId
        this.lastUpdate = lastUpdate
    }
}