/*
 * This file is generated by jOOQ.
 */
package org.example.db.generated.tables.records;


import java.time.LocalDateTime;

import org.example.db.generated.tables.Actor;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ActorRecord extends UpdatableRecordImpl<ActorRecord> implements Record4<Integer, String, String, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.actor.actor_id</code>.
     */
    public void setActorId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.actor.actor_id</code>.
     */
    public Integer getActorId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.actor.first_name</code>.
     */
    public void setFirstName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.actor.first_name</code>.
     */
    public String getFirstName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.actor.last_name</code>.
     */
    public void setLastName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.actor.last_name</code>.
     */
    public String getLastName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.actor.last_update</code>.
     */
    public void setLastUpdate(LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.actor.last_update</code>.
     */
    public LocalDateTime getLastUpdate() {
        return (LocalDateTime) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, String, String, LocalDateTime> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Integer, String, String, LocalDateTime> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Actor.ACTOR.ACTOR_ID;
    }

    @Override
    public Field<String> field2() {
        return Actor.ACTOR.FIRST_NAME;
    }

    @Override
    public Field<String> field3() {
        return Actor.ACTOR.LAST_NAME;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return Actor.ACTOR.LAST_UPDATE;
    }

    @Override
    public Integer component1() {
        return getActorId();
    }

    @Override
    public String component2() {
        return getFirstName();
    }

    @Override
    public String component3() {
        return getLastName();
    }

    @Override
    public LocalDateTime component4() {
        return getLastUpdate();
    }

    @Override
    public Integer value1() {
        return getActorId();
    }

    @Override
    public String value2() {
        return getFirstName();
    }

    @Override
    public String value3() {
        return getLastName();
    }

    @Override
    public LocalDateTime value4() {
        return getLastUpdate();
    }

    @Override
    public ActorRecord value1(Integer value) {
        setActorId(value);
        return this;
    }

    @Override
    public ActorRecord value2(String value) {
        setFirstName(value);
        return this;
    }

    @Override
    public ActorRecord value3(String value) {
        setLastName(value);
        return this;
    }

    @Override
    public ActorRecord value4(LocalDateTime value) {
        setLastUpdate(value);
        return this;
    }

    @Override
    public ActorRecord values(Integer value1, String value2, String value3, LocalDateTime value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ActorRecord
     */
    public ActorRecord() {
        super(Actor.ACTOR);
    }

    /**
     * Create a detached, initialised ActorRecord
     */
    public ActorRecord(Integer actorId, String firstName, String lastName, LocalDateTime lastUpdate) {
        super(Actor.ACTOR);

        setActorId(actorId);
        setFirstName(firstName);
        setLastName(lastName);
        setLastUpdate(lastUpdate);
    }
}