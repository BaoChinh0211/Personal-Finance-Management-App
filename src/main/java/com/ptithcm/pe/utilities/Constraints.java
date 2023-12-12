package com.ptithcm.pe.utilities;

public class Constraints {

    /* List Label*/
    public static final String LABEL_INFORMATION = "Thông tin",
            LABEL_CONFIRM = "Xác nhận",
            LABEL_ERROR = "Lỗi";

    /* Title */
    public static final String TITLE_MAIN = "Quản lý chi tiêu cá nhân",
            TITLE_MY_INFORMATION = "Thông tin cá nhân",
            TITLE_STATISTICS = "Thống kê",
            TITLE_CLOSE_WINDOWS = "Đóng cửa sổ",
            TITLE_LOGIN = "Đăng nhập",
            TITLE_REGISTER = "Đăng ký",
            TITLE_LOGOUT = "Đăng xuất",
            TITLE_EXIT = "Thoát",
            TITLE_FORGOT_PASSWORD = "Quên mật khẩu",
            TITLE_CHANGE_PASSWORD = "Thay đổi mật khẩu",
            TITLE_ADD_AN_EXPENSE_CATEGORY = "Thêm phân loại chi tiêu.",
            TITLE_ADD_AN_INCOME_CATEGORY = "Thêm phân loại thu nhập",
            TITLE_UPDATE_AN_EXPENSE_CATEGORY = "Chỉnh sửa phân loại chi tiêu",
            TITLE_UPDATE_AN_INCOME_CATEGORY = "Chỉnh sửa phân loại thu nhập",
            TITLE_LIST_EXPENSE_CATEGORIES = "Danh sách phân loại chi tiêu",
            TITLE_LIST_INCOME_CATEGORIES = "Danh sách phân loại thu nhập",
            TITLE_ADD_AN_EXPENSE = "Thêm một chi tiêu.",
            TITLE_ADD_AN_INCOME = "Thêm một thu nhập",
            TITLE_UPDATE_AN_EXPENSE = "Chỉnh sửa chi tiêu",
            TITLE_UPDATE_AN_INCOME = "Chỉnh sửa thu nhập",
            TITLE_LIST_OF_EXPENSES = "Danh sách chi tiêu",
            TITLE_LIST_OF_INCOMES = "Danh sách thu nhập";

    /* Message*/
    public static final String MESSAGE_SEND_CONFIRMATION_CODE_BEFORE = "Vui lòng chọn Gửi mã để nhận mã xác thực.",
            MESSAGE_SEND_CONFIRMATION_CODE_ALTER = "Vui lòng kiểm tra email bạn đăng ký để nhận mã xác thực",
            MESSAGE_CONFRIM_EXIT = "Bạn chắc chắn muốn thoát?";

    /* LOGIN */
    public static final String LOGIN_USERNAME_EMPTY = "Vui lòng nhập tên đăng nhập.",
            LOGIN_PASSWORD_EMPTY = "Vui lòng không để trống mật khẩu.",
            LOGIN_USERNAME_NOT_FOUND = "Người dùng không tồn tại.",
            LOGIN_PASSWORD_INCORRECT = "Mật khẩu không chính xác, vui lòng kiểm tra lại.",
            LOGIN_ERROR = "Đăng nhập thất bại, vui lòng thử lại.",
            LOGIN_SUCCESS = "Đăng nhập thành công!";

    /* REGISTER */
    public static final String REGISTER_NAME_EMPTY = "Vui lòng nhập họ và tên của bạn.",
            REGISTER_NAME_INVALID = "Vui lòng nhập họ và tên chỉ bao gồm chữ cái, không chứa số và các ký tự đặc biệt.",
            REGISTER_USERNAME_EMPTY = "Vui lòng nhập tên tài khoản.",
            REGISTER_USERNAME_SHORT = "Vui lòng nhập tên tài khoản trong khoảng độ dài từ 6 đến 20",
            REGISTER_USERNAME_INVALID = "Vui lòng nhập tên tài khoản chỉ bao gồm chữ cái, số, dấu gạch dưới",
            REGISTER_USERNAME_DUPLICATE = "Tên tài khoản này đã tồn tại, vui lòng chọn một tên khác.",
            REGISTER_PASSWORD_EMPTY = "Vui lòng nhập mật khẩu.",
            REGISTER_PASSWORD_SHORT = "Vui lòng nhập mật khẩu trong khoảng độ dài từ 6 đến 20.",
            REGISTER_PASSWORD_INVALID = "Vui lòng nhập mật khẩu bao gồm ít nhất 1 kí tự thường, 1 kí tự in hoa và 1 kí tự đặc biệt.",
            REGISTER_CONFIRM_PASSWORD_EMPTY = "Vui lòng không để trống xác nhận mật khẩu.",
            REGISTER_CONFIRM_PASSWORD_MISMATCH = "Xác nhận mật khẩu không chính xác, vui lòng kiểm tra lại.",
            REGISTER_EMAIL_EMPTY = "Vui lòng không để trống địa chỉ email.",
            REGISTER_EMAIL_SHORT = "Vui lòng nhập địa chỉ email trong khoảng độ dài từ 6 đến 30.",
            REGISTER_EMAIL_LONG = "Vui lòng nhập địa chỉ email tối đa 255 kí tự.",
            REGISTER_EMAIL_INVALID = "Vui lòng nhập email đúng định dạng.",
            REGISTER_CONFIRMATION_CODE_EMPTY = "Vui lòng không để trống mã xác nhận.",
            REGISTER_CONFIRMATION_CODE_MISMATCH = "Mã xác nhận không chính xác, vui lòng thử lại.",
            REGISTER_SEND_CONFIRMATION_CODE_SUCCESS = "Mã xác nhận đã được gửi thành công, vui lòng kiểm tra hộp thư email của bạn.",
            REGISTER_SEND_CONFIRMATION_CODE_FAIL = "Gửi mã xác nhận thất bại, vui lòng thử lại sau.",
            REGISTER_SUCCESS = "Đăng ký thành công",
            REGISTER_ERROR = "Đăng ký thất bại, vui lòng thử lại.";


    /* FORGOT PASSWORD */
    public static final String FGP_USERNAME_EMPTY = "Tên tài khoản không tồn tại trên hệ thống, vui lòng thử tên khác",
            FGP_USERNAME_NOT_EXISTS = "Tên tài khoản không tồn tại trong hệ thống, vui lòng kiểm tra lại hoặc sử dụng tên khác.",
            FGP_EMAIL_EMPTY = "Vui lòng nhập email bạn đã đăng ký",
            FGP_EMAIL_INVALID = "Vui lòng nhập email đúng định dạng",
            FGP_EMAIL_NOT_DUPLICATE = "Email không khớp với địa chỉ đã đăng ký, vui lòng kiểm tra lại.";

    /* CHANGE PASSWORD*/
    public static final String CP_PASSWORD_EMPTY = "Vui lòng nhập mật khẩu mới.",
            CP_PASSWORD_IS_DUPLICATED = "Mật khẩu mới trùng với mật khẩu cũ, vui lòng chọn một mật khẩu khác.",
            CP_PASSWORD_SHORT = "Vui lòng nhập mật khẩu mới trong khoảng độ dài từ 6 đến 20.",
            CP_PASSWORD_INVALID = "Vui lòng nhập mật khẩu mới bao gồm ít nhất 1 kí tự thường, 1 kí tự in hoa và 1 kí tự đặc biệt.",
            CP_CONFIRM_PASSWORD_EMPTY = "Vui lòng không để trống xác nhận mật khẩu.",
            CP_CONFIRM_PASSWORD_MISMATCH = "Vui lòng không để trống xác nhận mật khẩu.",
            CP_CONFIRMATION_CODE_EMPTY = "Vui lòng không để trống xác nhận mật khẩu.",
            CP_CONFIRMATION_CODE_MISMATCH = "Vui lòng không để trống xác nhận mật khẩu.",
            CP_SEND_CONFIRMATION_CODE_SUCCESS = "Mã xác nhận đã được gửi thành công, vui lòng kiểm tra hộp thư email của bạn.",
            CP_SEND_CONFIRMATION_CODE_FAIL = "Gửi mã xác nhận thất bại, vui lòng thử lại sau.",
            CP_CHANGE_PASSWORD_SUCCESS = "Thay đổi mật khẩu thành công",
            CP_CHANGE_PASSWORD_ERROR = "Lỗi thay đổi mật khẩu, vui lòng thử lại";

    /* ------------------- CATEGORY ----------------------------- */
    public static final String CATEGORY_CONFIRM_DELETE_AN_EXPENSE = "Bạn chắc chắn muốn xóa phân loại chi tiêu này?",
            CATEGORY_CONFIRM_DELETE_AN_INCOME = "Bạn chắc chắn muốn xóa phân loại thu nhập này?",
            CATEGORY_NAME_EMPTY = "Vui lòng nhập tên phân loại.",
            CATEGORY_NAME_INVALID = "Tên phân loại không hợp lệ, vui lòng thử lại.",
            CATEGORY_NAME_DUPLICATE = "Tên phân loại đã tồn tại, vui lòng thử tên khác.",
            CATEGORY_ADD_SUCCESS = "Thêm phân loại mới thành công.",
            CATEGORY_ADD_FAIL = "Thêm phân loại mới thất bại, vui lòng thử lại.",
            CATEGORY_UPDATE_SUCCESS = "Cập nhật phân loại thành công.",
            CATEGORY_UPDATE_FAIL = "Cập nhật phân loại thất bại, vui lòng thử lại.",
            CATEGORY_DELETE_SUCCESS = "Xóa phân loại thành công.",
            CATEGORY_DELETE_FAIL = "Xóa phân loại thất bại, vui lòng thử lại.";

    /* Financial */
    public static final String FINANCIAL_CONFIRM_DELETE_AN_EXPENSE = "Bạn chắc chắn muốn xóa khoản chi tiêu này?",
            FINANCIAL_CONFIRM_DELETE_AN_INCOME = "Bạn chắc chắn muốn xóa khoản thu nhập này?",
            FINANCIAL_CATEGORY_EMPTY = "Vui lòng chọn phân loại. Nếu chưa có thì hãy tạo phân loại mới",
            FINANCIAL_AMOUNT_EMPTY = "Vui lòng nhập khoản tiền",
            FINANCIAL_AMOUNT_SMALL = "Vui lòng nhập khoản tiền trên 1000",
            FINANCIAL_ADD_EXPENSE_SUCCESS  = "Thêm khoản chi tiêu thành công.",
            FINANCIAL_ADD_EXPENSE_FAIL = "Thêm khoản chi tiêu mới thất bại, vui lòng thử lại.",
            FINANCIAL_UPDATE_EXPENSE_SUCCESS = "Cập nhật khoản chi tiêu thành công.",
            FINANCIAL_UPDATE_EXPENSE_FAIL = "Cập nhật khoản chi tiêu thất bại, vui lòng thử lại.",
            FINANCIAL_DELETE_EXPENSE_SUCCESS = "Xóa khoản chi tiêu thành công.",
            FINANCIAL_DELETE_EXPENSE_FAIL = "Xóa khoản chi tiêu thất bại, vui lòng thử lại.",
            FINANCIAL_ADD_INCOME_SUCCESS  = "Thêm khoản thu nhập thành công.",
            FINANCIAL_ADD_INCOME_FAIL = "Thêm khoản thu nhập mới thất bại, vui lòng thử lại.",
            FINANCIAL_UPDATE_INCOME_SUCCESS = "Cập nhật khoản thu nhập thành công.",
            FINANCIAL_UPDATE_INCOME_FAIL = "Cập nhật khoản thu nhập thất bại, vui lòng thử lại.",
            FINANCIAL_DELETE_INCOME_SUCCESS = "Xóa khoản thu nhập thành công.",
            FINANCIAL_DELETE_INCOME_FAIL = "Xóa khoản thu nhập thất bại, vui lòng thử lại.";

}
