/*
 * This file is generated by jOOQ.
 */
package org.example.db.generated;


import org.example.db.generated.tables.Actor;
import org.example.db.generated.tables.Address;
import org.example.db.generated.tables.Cars;
import org.example.db.generated.tables.CarsStable;
import org.example.db.generated.tables.Category;
import org.example.db.generated.tables.City;
import org.example.db.generated.tables.Country;
import org.example.db.generated.tables.Customer;
import org.example.db.generated.tables.Film;
import org.example.db.generated.tables.FilmActor;
import org.example.db.generated.tables.FilmCategory;
import org.example.db.generated.tables.Inventory;
import org.example.db.generated.tables.Language;
import org.example.db.generated.tables.Payment;
import org.example.db.generated.tables.Rental;
import org.example.db.generated.tables.Staff;
import org.example.db.generated.tables.Store;
import org.example.db.generated.tables.records.ActorRecord;
import org.example.db.generated.tables.records.AddressRecord;
import org.example.db.generated.tables.records.CarsRecord;
import org.example.db.generated.tables.records.CarsStableRecord;
import org.example.db.generated.tables.records.CategoryRecord;
import org.example.db.generated.tables.records.CityRecord;
import org.example.db.generated.tables.records.CountryRecord;
import org.example.db.generated.tables.records.CustomerRecord;
import org.example.db.generated.tables.records.FilmActorRecord;
import org.example.db.generated.tables.records.FilmCategoryRecord;
import org.example.db.generated.tables.records.FilmRecord;
import org.example.db.generated.tables.records.InventoryRecord;
import org.example.db.generated.tables.records.LanguageRecord;
import org.example.db.generated.tables.records.PaymentRecord;
import org.example.db.generated.tables.records.RentalRecord;
import org.example.db.generated.tables.records.StaffRecord;
import org.example.db.generated.tables.records.StoreRecord;
import org.jooq.ForeignKey;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in
 * public.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<ActorRecord> ACTOR_PKEY = Internal.createUniqueKey(Actor.ACTOR, DSL.name("actor_pkey"), new TableField[] { Actor.ACTOR.ACTOR_ID }, true);
    public static final UniqueKey<AddressRecord> ADDRESS_PKEY = Internal.createUniqueKey(Address.ADDRESS, DSL.name("address_pkey"), new TableField[] { Address.ADDRESS.ADDRESS_ID }, true);
    public static final UniqueKey<CarsRecord> CARS_PK = Internal.createUniqueKey(Cars.CARS, DSL.name("cars_pk"), new TableField[] { Cars.CARS.ID }, true);
    public static final UniqueKey<CarsStableRecord> CARS_STABLE_PK = Internal.createUniqueKey(CarsStable.CARS_STABLE, DSL.name("cars_stable_pk"), new TableField[] { CarsStable.CARS_STABLE.ID }, true);
    public static final UniqueKey<CategoryRecord> CATEGORY_PKEY = Internal.createUniqueKey(Category.CATEGORY, DSL.name("category_pkey"), new TableField[] { Category.CATEGORY.CATEGORY_ID }, true);
    public static final UniqueKey<CityRecord> CITY_PKEY = Internal.createUniqueKey(City.CITY, DSL.name("city_pkey"), new TableField[] { City.CITY.CITY_ID }, true);
    public static final UniqueKey<CountryRecord> COUNTRY_PKEY = Internal.createUniqueKey(Country.COUNTRY, DSL.name("country_pkey"), new TableField[] { Country.COUNTRY.COUNTRY_ID }, true);
    public static final UniqueKey<CustomerRecord> CUSTOMER_PKEY = Internal.createUniqueKey(Customer.CUSTOMER, DSL.name("customer_pkey"), new TableField[] { Customer.CUSTOMER.CUSTOMER_ID }, true);
    public static final UniqueKey<FilmRecord> FILM_PKEY = Internal.createUniqueKey(Film.FILM, DSL.name("film_pkey"), new TableField[] { Film.FILM.FILM_ID }, true);
    public static final UniqueKey<FilmActorRecord> FILM_ACTOR_PKEY = Internal.createUniqueKey(FilmActor.FILM_ACTOR, DSL.name("film_actor_pkey"), new TableField[] { FilmActor.FILM_ACTOR.ACTOR_ID, FilmActor.FILM_ACTOR.FILM_ID }, true);
    public static final UniqueKey<FilmCategoryRecord> FILM_CATEGORY_PKEY = Internal.createUniqueKey(FilmCategory.FILM_CATEGORY, DSL.name("film_category_pkey"), new TableField[] { FilmCategory.FILM_CATEGORY.FILM_ID, FilmCategory.FILM_CATEGORY.CATEGORY_ID }, true);
    public static final UniqueKey<InventoryRecord> INVENTORY_PKEY = Internal.createUniqueKey(Inventory.INVENTORY, DSL.name("inventory_pkey"), new TableField[] { Inventory.INVENTORY.INVENTORY_ID }, true);
    public static final UniqueKey<LanguageRecord> LANGUAGE_PKEY = Internal.createUniqueKey(Language.LANGUAGE, DSL.name("language_pkey"), new TableField[] { Language.LANGUAGE.LANGUAGE_ID }, true);
    public static final UniqueKey<PaymentRecord> PAYMENT_PKEY = Internal.createUniqueKey(Payment.PAYMENT, DSL.name("payment_pkey"), new TableField[] { Payment.PAYMENT.PAYMENT_ID }, true);
    public static final UniqueKey<RentalRecord> RENTAL_PKEY = Internal.createUniqueKey(Rental.RENTAL, DSL.name("rental_pkey"), new TableField[] { Rental.RENTAL.RENTAL_ID }, true);
    public static final UniqueKey<StaffRecord> STAFF_PKEY = Internal.createUniqueKey(Staff.STAFF, DSL.name("staff_pkey"), new TableField[] { Staff.STAFF.STAFF_ID }, true);
    public static final UniqueKey<StoreRecord> STORE_PKEY = Internal.createUniqueKey(Store.STORE, DSL.name("store_pkey"), new TableField[] { Store.STORE.STORE_ID }, true);

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<AddressRecord, CityRecord> ADDRESS__FK_ADDRESS_CITY = Internal.createForeignKey(Address.ADDRESS, DSL.name("fk_address_city"), new TableField[] { Address.ADDRESS.CITY_ID }, Keys.CITY_PKEY, new TableField[] { City.CITY.CITY_ID }, true);
    public static final ForeignKey<CityRecord, CountryRecord> CITY__FK_CITY = Internal.createForeignKey(City.CITY, DSL.name("fk_city"), new TableField[] { City.CITY.COUNTRY_ID }, Keys.COUNTRY_PKEY, new TableField[] { Country.COUNTRY.COUNTRY_ID }, true);
    public static final ForeignKey<CustomerRecord, AddressRecord> CUSTOMER__CUSTOMER_ADDRESS_ID_FKEY = Internal.createForeignKey(Customer.CUSTOMER, DSL.name("customer_address_id_fkey"), new TableField[] { Customer.CUSTOMER.ADDRESS_ID }, Keys.ADDRESS_PKEY, new TableField[] { Address.ADDRESS.ADDRESS_ID }, true);
    public static final ForeignKey<FilmRecord, LanguageRecord> FILM__FILM_LANGUAGE_ID_FKEY = Internal.createForeignKey(Film.FILM, DSL.name("film_language_id_fkey"), new TableField[] { Film.FILM.LANGUAGE_ID }, Keys.LANGUAGE_PKEY, new TableField[] { Language.LANGUAGE.LANGUAGE_ID }, true);
    public static final ForeignKey<FilmActorRecord, ActorRecord> FILM_ACTOR__FILM_ACTOR_ACTOR_ID_FKEY = Internal.createForeignKey(FilmActor.FILM_ACTOR, DSL.name("film_actor_actor_id_fkey"), new TableField[] { FilmActor.FILM_ACTOR.ACTOR_ID }, Keys.ACTOR_PKEY, new TableField[] { Actor.ACTOR.ACTOR_ID }, true);
    public static final ForeignKey<FilmActorRecord, FilmRecord> FILM_ACTOR__FILM_ACTOR_FILM_ID_FKEY = Internal.createForeignKey(FilmActor.FILM_ACTOR, DSL.name("film_actor_film_id_fkey"), new TableField[] { FilmActor.FILM_ACTOR.FILM_ID }, Keys.FILM_PKEY, new TableField[] { Film.FILM.FILM_ID }, true);
    public static final ForeignKey<FilmCategoryRecord, CategoryRecord> FILM_CATEGORY__FILM_CATEGORY_CATEGORY_ID_FKEY = Internal.createForeignKey(FilmCategory.FILM_CATEGORY, DSL.name("film_category_category_id_fkey"), new TableField[] { FilmCategory.FILM_CATEGORY.CATEGORY_ID }, Keys.CATEGORY_PKEY, new TableField[] { Category.CATEGORY.CATEGORY_ID }, true);
    public static final ForeignKey<FilmCategoryRecord, FilmRecord> FILM_CATEGORY__FILM_CATEGORY_FILM_ID_FKEY = Internal.createForeignKey(FilmCategory.FILM_CATEGORY, DSL.name("film_category_film_id_fkey"), new TableField[] { FilmCategory.FILM_CATEGORY.FILM_ID }, Keys.FILM_PKEY, new TableField[] { Film.FILM.FILM_ID }, true);
    public static final ForeignKey<InventoryRecord, FilmRecord> INVENTORY__INVENTORY_FILM_ID_FKEY = Internal.createForeignKey(Inventory.INVENTORY, DSL.name("inventory_film_id_fkey"), new TableField[] { Inventory.INVENTORY.FILM_ID }, Keys.FILM_PKEY, new TableField[] { Film.FILM.FILM_ID }, true);
    public static final ForeignKey<PaymentRecord, CustomerRecord> PAYMENT__PAYMENT_CUSTOMER_ID_FKEY = Internal.createForeignKey(Payment.PAYMENT, DSL.name("payment_customer_id_fkey"), new TableField[] { Payment.PAYMENT.CUSTOMER_ID }, Keys.CUSTOMER_PKEY, new TableField[] { Customer.CUSTOMER.CUSTOMER_ID }, true);
    public static final ForeignKey<PaymentRecord, RentalRecord> PAYMENT__PAYMENT_RENTAL_ID_FKEY = Internal.createForeignKey(Payment.PAYMENT, DSL.name("payment_rental_id_fkey"), new TableField[] { Payment.PAYMENT.RENTAL_ID }, Keys.RENTAL_PKEY, new TableField[] { Rental.RENTAL.RENTAL_ID }, true);
    public static final ForeignKey<PaymentRecord, StaffRecord> PAYMENT__PAYMENT_STAFF_ID_FKEY = Internal.createForeignKey(Payment.PAYMENT, DSL.name("payment_staff_id_fkey"), new TableField[] { Payment.PAYMENT.STAFF_ID }, Keys.STAFF_PKEY, new TableField[] { Staff.STAFF.STAFF_ID }, true);
    public static final ForeignKey<RentalRecord, CustomerRecord> RENTAL__RENTAL_CUSTOMER_ID_FKEY = Internal.createForeignKey(Rental.RENTAL, DSL.name("rental_customer_id_fkey"), new TableField[] { Rental.RENTAL.CUSTOMER_ID }, Keys.CUSTOMER_PKEY, new TableField[] { Customer.CUSTOMER.CUSTOMER_ID }, true);
    public static final ForeignKey<RentalRecord, InventoryRecord> RENTAL__RENTAL_INVENTORY_ID_FKEY = Internal.createForeignKey(Rental.RENTAL, DSL.name("rental_inventory_id_fkey"), new TableField[] { Rental.RENTAL.INVENTORY_ID }, Keys.INVENTORY_PKEY, new TableField[] { Inventory.INVENTORY.INVENTORY_ID }, true);
    public static final ForeignKey<RentalRecord, StaffRecord> RENTAL__RENTAL_STAFF_ID_KEY = Internal.createForeignKey(Rental.RENTAL, DSL.name("rental_staff_id_key"), new TableField[] { Rental.RENTAL.STAFF_ID }, Keys.STAFF_PKEY, new TableField[] { Staff.STAFF.STAFF_ID }, true);
    public static final ForeignKey<StaffRecord, AddressRecord> STAFF__STAFF_ADDRESS_ID_FKEY = Internal.createForeignKey(Staff.STAFF, DSL.name("staff_address_id_fkey"), new TableField[] { Staff.STAFF.ADDRESS_ID }, Keys.ADDRESS_PKEY, new TableField[] { Address.ADDRESS.ADDRESS_ID }, true);
    public static final ForeignKey<StoreRecord, AddressRecord> STORE__STORE_ADDRESS_ID_FKEY = Internal.createForeignKey(Store.STORE, DSL.name("store_address_id_fkey"), new TableField[] { Store.STORE.ADDRESS_ID }, Keys.ADDRESS_PKEY, new TableField[] { Address.ADDRESS.ADDRESS_ID }, true);
    public static final ForeignKey<StoreRecord, StaffRecord> STORE__STORE_MANAGER_STAFF_ID_FKEY = Internal.createForeignKey(Store.STORE, DSL.name("store_manager_staff_id_fkey"), new TableField[] { Store.STORE.MANAGER_STAFF_ID }, Keys.STAFF_PKEY, new TableField[] { Staff.STAFF.STAFF_ID }, true);
}