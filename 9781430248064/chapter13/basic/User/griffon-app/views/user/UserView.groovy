package user

actions { action(id: 'createAction', name: 'Create', enabled: bind{ model.create }, closure: controller.create) }

application(title: 'User',
  preferredSize: [320, 240],
  pack: true,
  //location: [50,50],
  locationByPlatform:true,
  iconImage: imageIcon('/griffon-icon-48x48.png').image,
  iconImages: [imageIcon('/griffon-icon-48x48.png').image,
               imageIcon('/griffon-icon-32x32.png').image,
               imageIcon('/griffon-icon-16x16.png').image]) {

gridLayout(cols: 2, rows: 3) 
label 'First Name:'
textField columns: 20, 
text: bind(target: model, 'firstName', mutual: true)

label 'Last Name:'
textField columns:20,
text: bind(target: model, 'lastName', mutual: true)
label '' 
button  createAction, constraints: 'span 2, right'




}
