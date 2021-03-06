/*
 * This file is generated by jOOQ.
 */
package org.example.db.generated.tables.records


import java.time.LocalDateTime

import org.example.db.generated.tables.Inventory
import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record4
import org.jooq.Row4
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class InventoryRecord() : UpdatableRecordImpl<InventoryRecord>(Inventory.INVENTORY), Record4<Int?, Short?, Short?, LocalDateTime?> {

    var inventoryId: Int?
        set(value): Unit = set(0, value)
        get(): Int? = get(0) as Int?

    var filmId: Short?
        set(value): Unit = set(1, value)
        get(): Short? = get(1) as Short?

    var storeId: Short?
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

    override fun fieldsRow(): Row4<Int?, Short?, Short?, LocalDateTime?> = super.fieldsRow() as Row4<Int?, Short?, Short?, LocalDateTime?>
    override fun valuesRow(): Row4<Int?, Short?, Short?, LocalDateTime?> = super.valuesRow() as Row4<Int?, Short?, Short?, LocalDateTime?>
    override fun field1(): Field<Int?> = Inventory.INVENTORY.INVENTORY_ID
    override fun field2(): Field<Short?> = Inventory.INVENTORY.FILM_ID
    override fun field3(): Field<Short?> = Inventory.INVENTORY.STORE_ID
    override fun field4(): Field<LocalDateTime?> = Inventory.INVENTORY.LAST_UPDATE
    override fun component1(): Int? = inventoryId
    override fun component2(): Short? = filmId
    override fun component3(): Short? = storeId
    override fun component4(): LocalDateTime? = lastUpdate
    override fun value1(): Int? = inventoryId
    override fun value2(): Short? = filmId
    override fun value3(): Short? = storeId
    override fun value4(): LocalDateTime? = lastUpdate

    override fun value1(value: Int?): InventoryRecord {
        this.inventoryId = value
        return this
    }

    override fun value2(value: Short?): InventoryRecord {
        this.filmId = value
        return this
    }

    override fun value3(value: Short?): InventoryRecord {
        this.storeId = value
        return this
    }

    override fun value4(value: LocalDateTime?): InventoryRecord {
        this.lastUpdate = value
        return this
    }

    override fun values(value1: Int?, value2: Short?, value3: Short?, value4: LocalDateTime?): InventoryRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        return this
    }

    /**
     * Create a detached, initialised InventoryRecord
     */
    constructor(inventoryId: Int? = null, filmId: Short? = null, storeId: Short? = null, lastUpdate: LocalDateTime? = null): this() {
        this.inventoryId = inventoryId
        this.filmId = filmId
        this.storeId = storeId
        this.lastUpdate = lastUpdate
    }
}
