/*
    Copyright (c) 2009-2011 250bpm s.r.o.
    Copyright (c) 2007-2009 iMatix Corporation
    Copyright (c) 2007-2011 Other contributors as noted in the AUTHORS file

    This file is part of 0MQ.

    0MQ is free software; you can redistribute it and/or modify it under
    the terms of the GNU Lesser General Public License as published by
    the Free Software Foundation; either version 3 of the License, or
    (at your option) any later version.

    0MQ is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Lesser General Public License for more details.

    You should have received a copy of the GNU Lesser General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package zmq;

public interface IPollEvents {
    // Called by I/O thread when file descriptor is ready for reading.
    void in_event () ;

    // Called by I/O thread when file descriptor is ready for writing.
    void out_event () ;

    // Called by I/O thread when file descriptor might be ready for connecting.
    void connect_event () ;

    // Called by I/O thread when file descriptor is ready for accept.
    void accept_event();
    
    // Called when timer expires.
    void timer_event (int id_) ;


}
