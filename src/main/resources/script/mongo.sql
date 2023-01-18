db.Objects_Temp.find( { stereotypes: { $in: ['AlfaSystem'] } } ).count();

db.Objects_Temp.find( { stereotypes: 'AlfaComponent'} );

db.Objects_Temp.find( { sparxTags: { $exists: false} } ).pretty();

db.Objects_Temp.distinct("status");

db.Objects_Temp.find( { $and: [ { status: 'New'}, { guidParent: { $exists: false } } ] } );

db.Objects_Temp.find( { name: /^EQ/ } );
