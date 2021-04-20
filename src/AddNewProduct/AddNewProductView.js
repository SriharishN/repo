import React, { useEffect, useRef, useState } from 'react';
import { View, Text, TouchableOpacity, Image, Modal, TextInput, Switch } from 'react-native';
import { KeyboardAwareScrollView } from 'react-native-keyboard-aware-scroll-view';
import dynamicStyles from './styles';
import { useColorScheme } from 'react-native-appearance';
import DynamicAppStyles from '../../../../DynamicAppStyles';
import { IMLocalized } from '../../../../Core/localization/IMLocalization';
import TextButton from 'react-native-button';
import DropDownPicker from 'react-native-dropdown-picker';
import Button from 'react-native-button';

function AddNewProductView(props) {
    const colorScheme = useColorScheme();
    const styles = dynamicStyles(colorScheme);

    const [title, setTitle] = useState('');
    const [description, setDescription] = useState('');
    const [menu, setMenu] = useState('');
    const [department, setDepartment] = useState('');
    const [mirrorMenu, setMirrorMenu] = useState('');
    const [tax, setTax] = useState('');
    const [toggle, setToggle] = useState(true);
    const [toggleOff, setToggleOff] = useState(false);
const onCancel = () => {

}
const onPressAddProduct = () => {

}
const onImgIconLink = () => {

}
const renderAddImageIcon = () => {
  return (
      <View style={styles.imgContainer}>
       <View style={styles.imgBetween}>
        <TouchableOpacity
          style={styles.imageLayout}
          onPress={() => onImgIconLink()}
         >
          <Image
            source={require('../../../../../assets/icons/delivery-icon.png')}
            style={styles.imgIcon}
          />
        </TouchableOpacity>
        </View>
       <View style={styles.imgBetween}>
        <TouchableOpacity
          style={styles.imageLayout}
         >
          <Image
            source={require('../../../../../assets/icons/delivery-icon.png')}
            style={styles.imgIcon}
          />
        </TouchableOpacity>
        </View>
        <View style={styles.imgBetween}>
        <TouchableOpacity
          style={styles.imageLayout}
         >
          <Image
            source={require('../../../../../assets/icons/delivery-icon.png')}
            style={styles.imgIcon}
          />
        </TouchableOpacity>
        </View>
       <View style={styles.imgBetween}>
        <TouchableOpacity
          style={styles.imageLayout}
         >
          <Image
            source={require('../../../../../assets/icons/delivery-icon.png')}
            style={styles.imgIcon}
          />
        </TouchableOpacity>
        </View>
      </View>
  )
} 

// textinput
const renderAddNewProduct = () => {
    return (
        <View style={{height:'100%'}}>
          <View style={styles.section}>
          <TextInput
            style={styles.input}
            value={title}
            onChangeText={(text) => setTitle(text)}
            placeholder="Title"
            placeholderTextColor={DynamicAppStyles.colorSet[colorScheme].grey}
            underlineColorAndroid="transparent"
          />
          </View>
          <View style={styles.section}>
          <TextInput
            multiline={true}
            numberOfLines={2}
            style={styles.input}
            onChangeText={(text) => setDescription(text)}
            value={description}
            placeholder="Description"
            placeholderTextColor={DynamicAppStyles.colorSet[colorScheme].grey}
            underlineColorAndroid="transparent"
          />
        </View>
        <View style={styles.dropDown}>
            <DropDownPicker
              items={[
                {label: 'lunch', value: 'lunch'},
                {label: 'dinner', value: 'dinner'},
            ]}
              defaultNull
              onChangeItem={(item) => setMenu(item)}
              style={styles.input}
              placeholder="Select Menu"
              placeholderTextColor={DynamicAppStyles.colorSet[colorScheme].grey}
              underlineColorAndroid="transparent"
              containerStyle={styles.dropDownContainer}
              itemStyle={styles.dropDownItem}
            labelStyle={styles.dropDownLabel}
            dropDownStyle={styles.dropDownValue}
            arrowStyle={styles.dropDownArrow}
            placeholderStyle={styles.dropDownPlaceHolder}
          />
        </View>
        <View style={styles.section}>
          <TextInput
            style={styles.input}
            value={department}
            onChangeText={(text) => setDepartment(text)}
            placeholder="Department"
            placeholderTextColor={DynamicAppStyles.colorSet[colorScheme].grey}
            underlineColorAndroid="transparent"
          />
        </View>
        <View style={styles.section}>
            <DropDownPicker
              items={[
                {label: 'lunch', value: 'lunch'},
                {label: 'dinner', value: 'dinner'},
            ]}
              defaultNull
              onChangeItem={(item) => setMirrorMenu(item)}
              value={mirrorMenu}
              style={styles.input}
              placeholder="Select Mirror in Menu"
              placeholderTextColor={DynamicAppStyles.colorSet[colorScheme].grey}
              underlineColorAndroid="transparent"
              containerStyle={styles.dropDownContainer}
              itemStyle={styles.dropDownItem}
            labelStyle={styles.dropDownLabel}
            dropDownStyle={styles.dropDownValue}
            arrowStyle={styles.dropDownArrow}
            placeholderStyle={styles.dropDownPlaceHolder}
          />
         </View>
         <View style={styles.switchView}>
            <DropDownPicker
              items={[
                {label: '18', value: '18'},
                {label: '15', value: '15'},
            ]}
              defaultNull
              onChangeItem={(item) => setTax(item)}
              value={tax}
              style={styles.taxInput}
              placeholder="Select Tax"
              placeholderTextColor={DynamicAppStyles.colorSet[colorScheme].grey}
              underlineColorAndroid="transparent"
              containerStyle={styles.dropDownContainer}
              itemStyle={styles.dropDownItem}
            labelStyle={styles.dropDownLabel}
            dropDownStyle={styles.dropDownValue}
            arrowStyle={styles.dropDownArrow}
            placeholderStyle={styles.dropDownPlaceHolder}
          />
          <Text style={styles.inclusiveTitle}>{IMLocalized('Inclusive')}</Text>
          <Switch
            style={styles.toggleBtn}
            trackColor={{false: DynamicAppStyles.colorSet[colorScheme].grey, true: 'green'}}
            thumbColor="white"
            ios_backgroundColor="gray"
            onValueChange={(value) => setToggle(value)}
            value={toggle}
          />
        </View>
        <View style={styles.section}>
          <Text style={styles.sectionTitle}>{IMLocalized('Non-Sellable')}</Text>
          <Switch
            style={styles.toggleBtn}
            trackColor={{false: 'gray', true: '#5DBB57'}}
            thumbColor="white"
            ios_backgroundColor="gray"
            onValueChange={(value) => setToggleOff(value)}
            value={toggleOff}
          />
        </View>
        <Button
          containerStyle={styles.btnContainer}
          style={styles.btnText}
          onPress={() => onPressAddProduct()}>
          {IMLocalized('ADD VARIANT')}
         </Button>
      </View>
    )
}
  return(
    <Modal
        visible={props.isVisible}
        animationType="slide">
        <KeyboardAwareScrollView
         style={{ flex: 1, width: '100%' }}
         keyboardShouldPersistTaps="always">
        <View>
         <View style={[styles.bar, styles.navBarContainer]}>
         <TouchableOpacity
          style={styles.backIconBlock}
          onPress={() => props.navigation.goBack()}>
          <Image
            style={DynamicAppStyles.styleSet.backArrowStyle}
            source={DynamicAppStyles.iconSet.backArrow}
          />
          </TouchableOpacity>
          <Text style={styles.headerTitle}>{IMLocalized('Add Products')}</Text>
          <TextButton
            style={[styles.rightButton, styles.selectorRightButton]}
            onPress={onCancel}>
            {IMLocalized('Save')}
          </TextButton>
        </View>
        <View>
          {renderAddImageIcon()}
        </View>
        <View>
           {renderAddNewProduct()}
        </View>
      </View>
        </KeyboardAwareScrollView>
    </Modal>
    )
}
export default AddNewProductView;