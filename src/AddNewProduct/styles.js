import { StyleSheet } from 'react-native';
import DynamicAppStyles from '../../../../DynamicAppStyles';

const dynamicStyles = (colorScheme) => {
    return StyleSheet.create({
      mainContainer: {
        flex: 1,
        height: '100%'
      },
      container: {
            backgroundColor:
              DynamicAppStyles.colorSet[colorScheme].mainThemeBackgroundColor,
            justifyContent: 'center',
            height: 155,
            alignItems: 'center',
            flexDirection: 'row',
            borderBottomWidth: 1,
            borderBottomColor: DynamicAppStyles.colorSet[colorScheme].hairlineColor,
        },
        imgContainer: {
            backgroundColor:
              DynamicAppStyles.colorSet[colorScheme].mainThemeBackgroundColor,   
            alignItems: 'center',
            height: 65,
            flexDirection: 'row',
            borderBottomWidth: 1,
            borderBottomColor: DynamicAppStyles.colorSet[colorScheme].hairlineColor,
            backgroundColor: '#5DBB57',  // green color
        },
      body: {
            flex: 1,
            backgroundColor:
              DynamicAppStyles.colorSet[colorScheme].mainThemeBackgroundColor,
        },
      bar: {
        height: 150,
        width: '100%',
        marginTop: Platform.OS === 'ios' ? 30 : 0,
        justifyContent: 'center',
      },
      navBarContainer: {
       // backgroundColor:
         // DynamicAppStyles.colorSet[colorScheme].mainThemeBackgroundColor,
         
          backgroundColor: '#5DBB57',  // green color
      },
      headerTitle: {
        position: 'absolute',
        textAlign: 'center',
        width: '100%',
        fontWeight: 'bold',
        fontSize: 28,
        //color: DynamicAppStyles.colorSet[colorScheme].mainTextColor,
        color: '#FFFFFF',
        fontFamily: 'FontAwesome',
      },
      rightButton: {
        top: 0,
        right: 0,
        backgroundColor: 'transparent',
        alignSelf: 'flex-end',
        //color: DynamicAppStyles.colorSet[colorScheme].mainThemeForegroundColor,
        color: '#0000ff', // blue
        fontWeight: 'normal',
        fontFamily: 'FontAwesome',
        bottom: 50,
        position: 'relative',
        fontSize: 20,
      },
      selectorRightButton: {
        marginRight: 10,
      },
      divider: {
        height: 10,
        backgroundColor: DynamicAppStyles.colorSet[colorScheme].hairlineColor,
      },
      section: {
        backgroundColor:
          DynamicAppStyles.colorSet[colorScheme].mainThemeBackgroundColor,
        marginBottom: 15,
      },
      sectionTitle: {
        textAlign: 'left',
        alignItems: 'center',
        color: DynamicAppStyles.colorSet[colorScheme].title,
        fontSize: 19,
        padding: 10,
        paddingTop: 15,
        paddingBottom: 7,
        fontFamily: DynamicAppStyles.fontFamily.regularFont,
        fontWeight: 'bold',
      },
      input: {
        width: '90%',
        fontSize: 22,
        padding: 12,
        textAlignVertical: 'top',
        justifyContent: 'flex-start',
        paddingRight: 0,
        fontFamily: DynamicAppStyles.fontFamily.regularFont,
        color: DynamicAppStyles.colorSet[colorScheme].text,
        borderWidth: 2,
        marginStart:20,
        borderRadius: 10,
        borderColor: '#90ee90',
      },
      dropDown: {
        backgroundColor:
          DynamicAppStyles.colorSet[colorScheme].mainThemeBackgroundColor,
        marginBottom: 15,
        minHeight: 150,
      },
      dropDownValue: {
        backgroundColor: '#fafafa',
        width: '90%',
        marginLeft: 20,
        marginRight: 20,
      },
      dropDownLabel: {
        fontSize: 16,
      },
      dropDownContainer: {
        
      },
      dropDownPlaceHolder: {
        fontSize: 20,
        color: DynamicAppStyles.colorSet[colorScheme].grey,
      },
      dropDownItem : {
        justifyContent: 'flex-start',
      },
      dropDownArrow: {
        marginRight: 10
      },
      taxInput: {
        width: '50%',
        fontSize: 22,
        padding: 12,
        textAlignVertical: 'top',
        justifyContent: 'flex-start',
        paddingRight: 0,
        fontFamily: DynamicAppStyles.fontFamily.regularFont,
        color: DynamicAppStyles.colorSet[colorScheme].text,
        borderWidth: 2,
        marginStart:20,
        borderRadius: 10,
        borderColor: '#90ee90',
      },
      toggleBtn: {
        flex: 2,
        transform: [{ scaleX: 1.8}, { scaleY: 1.8 }],
        alignSelf: 'flex-end',
        marginRight: 20,
        bottom: 30,
      },
      switchView: {
        backgroundColor:
          DynamicAppStyles.colorSet[colorScheme].mainThemeBackgroundColor,
          width: '100%'
      },
      sectionCheck: {
        backgroundColor:
          DynamicAppStyles.colorSet[colorScheme].mainThemeBackgroundColor,
        marginBottom: 15,
        bottom: 100,
      },
      inclusiveTitle: {
        color: DynamicAppStyles.colorSet[colorScheme].title,
        fontSize: 19,
        fontFamily: DynamicAppStyles.fontFamily.regularFont,
       position: 'absolute',
       textAlign: 'center',
       left: 250,
       top: 10,
      },
      btnContainer: {
        width: '70%',
        //backgroundColor: DynamicAppStyles.colorSet[colorScheme].mainThemeForegroundColor,
        backgroundColor: '#5DBB57', // green color
        borderRadius: 25,
        padding: 10,
        marginBottom: 20,
        alignSelf: 'center',
      },
      btnText: {
        color: '#ffffff',
        fontSize: 20,
      },
      imgIcon: {
        height: 50,
        width: 50,
        tintColor: '#0000ff',
        alignItems: 'center',
      },
      imgBetween: {
        height: '100%',
        width: '25%',
        alignItems: 'center',
      },
      backIconBlock: {
        alignSelf: 'flex-start',
        backgroundColor: '#FFFFFF',
        marginLeft: 20,
        position: 'absolute',
        paddingRight: 15,
        paddingLeft: 5,
        height: '40%',
        borderWidth: 1,
        borderRadius: 10,
      },
      imageLayout: {
        height: '90%',
        backgroundColor: 'white',
        borderRadius: 30,
        padding: 8,
      }
    })
}
export default dynamicStyles;