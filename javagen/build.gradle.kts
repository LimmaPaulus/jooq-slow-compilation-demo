plugins {
    kotlin("jvm")
    id("nu.studer.jooq")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.jooq:jooq-codegen:3.16.5")
    jooqGenerator("org.postgresql:postgresql:42.3.1")
}

jooq {
    configurations {
        create("main") {
            generateSchemaSourceOnCompilation.set(false)
            version.set("3.16.5")
            jooqConfiguration.apply {
                jdbc.apply {
                    driver = "org.postgresql.Driver"
                    url = "jdbc:postgresql://localhost:8101/pagila"
                    user = "postgres"
                    password = "pgpassword"
                }
                generator.apply {
                    name = "org.jooq.codegen.JavaGenerator"
                    database.apply {
                        name = "org.jooq.meta.postgres.PostgresDatabase"
                        inputSchema = "public"
                    }
                    target.apply {
                        packageName = "org.example.db.generated"
                        directory = "src/generated/java/"
                    }
                }
            }
        }
    }
}
