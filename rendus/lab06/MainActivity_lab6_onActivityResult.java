// Référence Lab 6 — extrait : ouverture du formulaire et réception du résultat
// (Le projet final utilise Lab 7 : ActivityResultLauncher + Room)

// private static final int REQUEST_ADD_EDIT_LIVRE = 100;
//
// fabAjouterLivre.setOnClickListener(v -> {
//     Intent intent = new Intent(MainActivity.this, AddEditActivity.class);
//     intent.putExtra(AddEditActivity.EXTRA_MODE, AddEditActivity.MODE_ADD);
//     startActivityForResult(intent, REQUEST_ADD_EDIT_LIVRE);
// });
//
// @Override
// protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//     super.onActivityResult(requestCode, resultCode, data);
//     if (requestCode == REQUEST_ADD_EDIT_LIVRE && resultCode == RESULT_OK && data != null) {
//         String mode = data.getStringExtra(AddEditActivity.EXTRA_MODE);
//         Livre livre = (Livre) data.getSerializableExtra(AddEditActivity.EXTRA_LIVRE);
//         int position = data.getIntExtra(AddEditActivity.EXTRA_POSITION, -1);
//         // ... ajout ou modification dans ArrayList + notifyDataSetChanged()
//     }
// }
