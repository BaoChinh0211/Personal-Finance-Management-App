/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.pe.utilities;

/**
 *
 * @author tezca
 */
public class Constraints {

    public static final String NOTIFY = "Thông báo";
    public static final String LOGIN = "Đăng nhập";
    public static final String REGISTER = "Đăng ký";
    public static final String FORGOT_PASSWORD = "Quên mật khẩu";
    public static final String CHANGE_PASSWORD = "Thay đổi mật khẩu";
    public static final String VERIFY = "Xác thực";
    public static final String CONFIRM = "Xác nhận";
    public static final String CONFIRM_DELETE = "Xác nhận xóa";
    public static final String ERROR = "Lỗi";
    public static final String NOTIFY_SEND_VERIFICATION_CODE_BEFORE = "Vui lòng chọn Gửi mã để nhận được mã xác thực";
    public static final String NOTIFY_SEND_VERIFICATION_CODE_ALTER = "Vui lòng kiểm tra trong email bạn đã chọn để nhận mã xác thực";
    public static final String MY_PROFILE = "Thông tin cá nhân";
    /* Tabbed Pane */
    public static final String TITLE_ADD_NEW_EXPENDITURE_TYPE = "Thêm danh mục chi tiêu mới";
    public static final String TITLE_UPDATE_EXPENDITURE_TYPE = "Sửa danh mục chi tiêu";
    public static final String TITLE_LIST_EXPENDITURE_TYPE = "Danh mục chi tiêu";
    public static final String TITLE_ADD_NEW_EXPENDITURE = "Thêm chi tiêu mới";
    public static final String TITLE_UPDATE_EXPENDITURE = "Sưa chi tiết chi tiêu";
    public static final String TITLE_LIST_EXPENDITURE = "Danh sách chi tiêu";
    public static final String TITLE_ADD_NEW_RECEIPT_TYPE = "Thêm danh mục thu nhập mới";
    public static final String TITLE_UPDATE_RECEIPT_TYPE = "Thêm danh mục thu nhập mới";
    public static final String TITLE_LIST_RECEIPT_TYPE = "Danh mục thu nhập";
    public static final String TITLE_ADD_NEW_RECEIPT = "Thêm thu nhập mới";
    public static final String TITLE_UPDATE_RECEIPT = "Sửa chi tiết thu nhập";
    public static final String TITLE_LIST_RECEIPT = "Danh sách thu nhập";
    public static final String TITLE_MAIN = "Quản lý chi tiêu cá nhân";
    public static final String STATISTICS = "Thống kê";
    public static final String CLOSE_WINDOWS = "Đóng cửa sổ";

    /* LOGIN */
    public static final String USERNAME_IS_EMPTY = "Vui lòng không để trống tên tài khoản";
    public static final String PASSWORD_IS_EMPTY = "Vui lòng không để trống mật khẩu";
    public static final String USER_NOT_EXIST = "Người dùng không tồn tại";
    public static final String PASSWORD_IS_INCORRECT = "Mật khẩu không chính xác, vui lòng kiểm tra lại";
    public static final String LOGIN_ERROR = "Lỗi đăng nhập";
    public static final String LOGIN_SUCCESS = "Đăng nhập thành công!";

    /* REGISTER */
    public static final String CONFIRM_PASSWORD_IS_EMPTY = "Vui lòng không để trống xác nhận mật khẩu!";
    public static final String CONFIRM_PASSWORD_IS_INCORRECT = "Xác nhận mật khẩu không chính xác, vui lòng kiểm tra lại!";
    public static final String NAME_IS_EMPTY = "Vui lòng không để trống tên!";
    public static final String NAME_IS_INVALID = "Vui lòng nhập họ và tên chỉ bao gồm các chữ cái, không chứa số và kí tự đặc biệt";
    public static final String USERNAME_IS_SHORT = "Vui lòng nhập tên tài khoản nằm trong khoảng độ dài giữa 6 và 20";
    public static final String USERNAME_IS_INVALID = "Vui lòng nhập tên tài khoản chỉ bao gồm các chữ cái, số, dấu gạch dưới";  
    public static final String USERNAME_IS_EXITS = "Tên tài khoản đã tồn tại, vui lòng thử tên khác";
    public static final String PASSWORD_IS_SHORRT = "Vui lòng nhập mật khẩu nằm trong khoảng độ dài giữa 6 và 20";
    public static final String PASSWORD_IS_INVALID = "Vui lòng nhập mật khẩu bao gồm ít nhất 1 kí tự thường, 1 kí tự in hoa và 1 kí tự đặc biệt";
    public static final String EMAIL_IS_EMPTY = "Vui lòng không để trống Email!"; 
    public static final String EMAIL_IS_SHORT = "Vui lòng nhập tên người dùng nằm trong khoảng độ dài giữa 6 và 30";    
    public static final String EMAIL_IS_LONG = "Vui lòng nhập địa chỉ email tối đa 255 kí tự";
    public static final String EMAIL_IS_INVALID = """
            Vui lòng nhập email đúng định dạng:
            \t - Tên người dùng chỉ bao gồm các kí tự chữ cái, số và dấu chấm.
            \t - Tên người dùng không chứa 2 dấu chấm liên tiếp.
            \t - Tên người dùng không bắt đầu và kết thúc bằng dấu chấm.""";
    public static final String VERIFICATION_CODE_IS_EMPTY = "Vui lòng nhập mã xác nhận";
    public static final String VERIFICATION_CODE_IS_INVALID = "Mã xác nhận không chính xác, vui lòng thử lại";
    public static final String SEND_VERIFICATION_CODE_SUCCESS = "Gửi mã xác nhận thành công";
    public static final String SEND_VERIFICATION_CODE_FAIL = "Gửi mã xác nhận thất bại, vui lòng thử lại";

    public static final String REGISTER_ERROR = "Lỗi đăng ký tài khoản";
    public static final String REGISTER_SUCCESS = "Đăng ký tài khoản thành công";

    /* FORGOT PASSWORD */
    public static final String USERNAME_IS_NOT_EXITS = "Tên tài khoản không tồn tại trên hệ thống, vui lòng thử tên khác";
    public static final String EMAIL_IS_INVALID2 = "Vui lòng nhập email đúng định dạng";
    public static final String EMAIL_IS_NOT_EXITS = "Email không trùng với email đăng ký, vui lòng kiếm tra lại";
    public static final String SET_NEW_PASSWORD_SUCCESS = "Thay đổi mật khẩu thành công";
    public static final String SET_NEW_PASSWORD_ERROR = "Lỗi thay đổi mật khẩu";

    /* CHANGE PASSWORD*/
    public static final String NEW_PASSWORD_IS_DUPLICATED = "Mật khẩu mới không được trùng với mật khẩu cũ, vui lòng đổi một mật khẩu khác";

    /* Thêm mới một Group*/
    public static final String NAME_GROUP_IS_EMPTY = "Tên phân loại không được để trống";
    public static final String NAME_GROUP_IS_INVALID = "Tên phân loại không hợp lệ, vui lòng thử lại";
    public static final String ADD_NEW_GROUP_ERROR = "Thêm phân loại mới thất bại";
    public static final String ADD_NEW_GROUP_SUCCESS = "Thêm phân loại mới thành công";

    public static final String ADD_GROUP_ERROR = "Lỗi thêm phân loại mới";
    
    /* Cập nhật một Group*/
    public static final String UPDTA_GROUP = "Cập nhật thông tin phân loại";
    public static final String UPDATE_GROUP_SUCCESS = "Cập nhật thông tin phân loại mới thành công";
    public static final String UPDATE_GROUP_FAILD = "Cập nhật thông tin phân loại mới thất bại, vui lòng thử lại";

    /* Xóa một Group */
    public static final String DELETE_GROUP = "Xóa phân loại chi tiêu";
    public static final String DELETE_GROUP_SUCCESS = "Xóa phân loại thành công";
    public static final String DELETE_GROUP_FAILD = "Xóa phân loại thất bại";
    public static final String DELETE_GROUP_CONFIRM = "Bạn chắc chắn muốn xóa phân loại này?";

}
