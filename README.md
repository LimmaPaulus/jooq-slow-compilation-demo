Modules javagen and kotlingen contains identical JOOQ code generations expect that first one is
generated to Java code and second to Kotlin.

Run commands following commands to see the difference in build times
- ./gradlew kotlingen:build --rerun-tasks
- ./gradlew javagen:build --rerun-tasks
