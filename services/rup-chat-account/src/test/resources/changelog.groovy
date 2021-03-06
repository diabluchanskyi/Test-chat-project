databaseChangeLog {

  changeSet(id: '1343662408957-1', author: 'Maksym_Labazov (generated)') {
    createTable(tableName: 'account') {
      column(name: 'account_uid', type: 'int8') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'Key1')
      }
      column(name: 'name', type: 'TEXT') {
        constraints(nullable: false)
      }
      column(name: 'email', type: 'TEXT')
      column(name: 'password', type: 'TEXT') {
        constraints(nullable: false)
      }
    }
  }

  changeSet(id: '1343662408957-2', author: 'Maksym_Labazov (generated)') {
    createTable(tableName: 'account_2_room') {
      column(name: 'room_uid', type: 'int8') {
        constraints(nullable: false)
      }
      column(name: 'account_uid', type: 'int8') {
        constraints(nullable: false)
      }
      column(name: 'private_flag', type: 'bool') {
        constraints(nullable: false)
      }
    }
  }

  changeSet(id: '1343662408957-3', author: 'Maksym_Labazov (generated)') {
    createTable(tableName: 'room') {
      column(name: 'room_uid', type: 'int8') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'Key2')
      }
      column(name: 'name', type: 'TEXT')
      column(name: 'description', type: 'TEXT')
    }
  }

  changeSet(id: '1343662408957-4', author: 'Maksym_Labazov (generated)') {
    addPrimaryKey(columnNames: 'room_uid, account_uid', constraintName: 'Key4', tableName: 'account_2_room')
  }

  changeSet(id: '1343662408957-5', author: 'Maksym_Labazov (generated)') {
    addForeignKeyConstraint(baseColumnNames: 'account_uid', baseTableName: 'account_2_room', constraintName: 'Relationship3', deferrable: false, initiallyDeferred: false, onDelete: 'NO ACTION', onUpdate: 'NO ACTION', referencedColumnNames: 'account_uid', referencedTableName: 'account', referencesUniqueColumn: false)
  }

  changeSet(id: '1343662408957-6', author: 'Maksym_Labazov (generated)') {
    addForeignKeyConstraint(baseColumnNames: 'room_uid', baseTableName: 'account_2_room', constraintName: 'Relationship2', deferrable: false, initiallyDeferred: false, onDelete: 'NO ACTION', onUpdate: 'NO ACTION', referencedColumnNames: 'room_uid', referencedTableName: 'room', referencesUniqueColumn: false)
  }
}